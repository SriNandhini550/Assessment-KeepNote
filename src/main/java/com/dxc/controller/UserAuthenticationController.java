package com.dxc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.IncorrectPasswordException;
import com.dxc.exception.UserNotFoundException;
import com.dxc.model.UserCredentials;
import com.dxc.service.UserService;

@RestController
public class UserAuthenticationController {
  
	@Autowired
	public UserService userService;
	
	@PostMapping("/login")
	public String authenticateUser(@RequestBody UserCredentials credentails,HttpSession session) throws UserNotFoundException, IncorrectPasswordException{
		final String user = this.userService.authenticateUser(credentails.getUserId(), credentails.getUserPassword());
		return user;
	}
	
	@PostMapping("/logout")
	public String authenticateUserlogout(@RequestBody UserCredentials credentails,HttpSession session) throws UserNotFoundException, IncorrectPasswordException{
		final String user = this.userService.authenticateUserlogout(credentails.getUserId(), credentails.getUserPassword());
		return user;
	}
}
