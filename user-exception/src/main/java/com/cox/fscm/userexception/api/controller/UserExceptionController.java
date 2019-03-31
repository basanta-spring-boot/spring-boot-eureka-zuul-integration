package com.cox.fscm.userexception.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cox.fscm.userexception.api.model.UserRequest;

@RestController
@RequestMapping("/userexception")
public class UserExceptionController {

	@Autowired
	private RestTemplate template;

	static final String CONFLICT_API_URL = "http://CONFLICTMANAGEMENT-API/conflictManagement/isConflict/";

	@GetMapping("/testing")
	public String test() {
		return "request coming...";
	}

	@PostMapping("/createActivity")
	public String createActivity(@RequestBody UserRequest request) {
		Boolean status = template.getForObject(CONFLICT_API_URL + request.getUserId(), Boolean.class);
		System.out.println("Log UserException : " + status);
		if (status) {
			return "Activity created successfully for " + request.getUserId();
		} else {
			return "Task conflict occure " + request.getUserId();
		}
	}

}
