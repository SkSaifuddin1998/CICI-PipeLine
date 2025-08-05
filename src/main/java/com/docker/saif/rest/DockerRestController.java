package com.docker.saif.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerRestController {

	
	@GetMapping("/message")
	public String message() {
		return "Welcome To Docker Image Creation ";
	}
	
	@GetMapping("/container")
	public String dockerContainer() {
		return "Welcome To Docker Container ";
	}
	
	@GetMapping("/tag")
	public String dockerTagName() {
		return "Welcome To Docker Tag Name Created";
	}
	
	@GetMapping("/cicd")
	public String dockerCICDPipeline() {
		return "Welcome To Docker CICD pIPELINE";
	}
}
