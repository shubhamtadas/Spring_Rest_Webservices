package com.java.app.controller;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class SpringJavaController {

@RequestMapping("/")

	public String welcome() {

		return "Welcome to Java Spring Boot Tutorials";

	}

	@RequestMapping("/hello")

	public String myData() {

		return "Hello Spring Boot";

	}

	 @RequestMapping(method = RequestMethod.GET, value="/{id}", headers="Accept=*/*")

	    public String getUserById(@PathVariable String id)

	    {

	         return ("User is successfully created :"+id);

	    }

}

