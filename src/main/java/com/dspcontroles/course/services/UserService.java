package com.dspcontroles.course.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.dspcontroles.course.repositories.UserRepository;

public class UserService {
	
	@Autowired
	private UserRepository repository;

}
