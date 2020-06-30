package com.assignment.app.controller;

import com.assignment.app.entity.User;
import com.assignment.app.repository.UserRepository;
import com.assignment.app.service.UserService;
import com.assignment.app.userdto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	UserService userService;

	@Autowired
	private UserRepository userRepository;

//	@GetMapping("/user/{id}")
//	public UserDTO getUser(@PathVariable Integer id) {
//		User user = userService.getUsers().stream().filter(o -> o.getId() == id).collect(Collectors.toList()).get(0);
//
//		return new UserDTO(user.getName(), user.getAge(), user.getEmail());
//	}

	@GetMapping("/user/{id}")
	public UserDTO getData(@PathVariable Integer id) {
		User user = userRepository.getUser(id);
		UserDTO userDetail = new UserDTO(user.getName(), user.getAge(), user.getEmail());
		return userDetail;
	}

}
