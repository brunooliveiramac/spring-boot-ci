package com.jenkins.ci.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.jenkins.ci.jenkins.service.JenkinsService;

@ComponentScan(basePackageClasses = JenkinsService.class)
@SpringBootApplication
public class JenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsApplication.class, args);
	}
}
