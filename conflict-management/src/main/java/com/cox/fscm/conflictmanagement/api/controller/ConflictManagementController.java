package com.cox.fscm.conflictmanagement.api.controller;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conflictManagement")
public class ConflictManagementController {

	@GetMapping("/isConflict/{userId}")
	public boolean isConflict(@PathVariable int userId) {
		/*
		 * Here it will call OFSC Web services with parameter userId and will verify
		 * conflict
		 */
		boolean status = new Random().nextBoolean();
		System.out.println("Log ConflictManagementController : " + status);
		return status;
	}

}
