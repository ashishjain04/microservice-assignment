package com.assignment.app.service;

import java.util.ArrayList;
import java.util.List;

import com.assignment.app.entity.User;
import org.springframework.stereotype.Service;
@Service
public class UserService {

	private List<User> users = new ArrayList<>();
	
	public List<User> getUsers() {
		users.add(new User(1, "Ravi", 32, "ravi@abc.com"));
		users.add(new User(2, "Sahil", 25, "sahil123@gmail.com"));
		users.add(new User(3, "Ankit", 14, "ankit77@yahoo.com"));
		users.add(new User(4, "Rishabh",47, "rishabh32@gmail.com"));
		return users;
	}

	
}
