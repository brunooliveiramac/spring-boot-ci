package com.jenkins.ci.jenkins.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.maven.model.Model;
import org.apache.maven.model.io.xpp3.MavenXpp3Reader;
import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.ci.jenkins.JenkinsApplication;
import com.jenkins.ci.jenkins.model.Project;

@RestController
@RequestMapping("/vesion")
public class JenkinsService {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Project getVesion() throws FileNotFoundException, IOException, XmlPullParserException {
		 MavenXpp3Reader reader = new MavenXpp3Reader();
	     Model model = reader.read(new FileReader("pom.xml"));
		return new Project(model.getVersion());
	} 

}
