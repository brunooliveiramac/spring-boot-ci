package com.jenkins.ci.jenkins.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jenkins.ci.jenkins.model.Project;

@RestController
@RequestMapping("/version")
public class JenkinsService {

	@RequestMapping(method = RequestMethod.GET, produces = "application/json")
	public Project getVesion() {
		return new Project("1.0.0");
	}
	
	@RequestMapping(path="/test", method = RequestMethod.GET, produces = "application/json")
	public Project getTest() {
		return new Project("Testing");
	}

}
