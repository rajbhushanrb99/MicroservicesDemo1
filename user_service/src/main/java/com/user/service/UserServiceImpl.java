package com.user.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list 
	List<User> list = Arrays.asList(
			new User(1211L,"Raj","2223222"),
			new User(1311L,"Raja","2333222"),
			new User(1411L,"Rajiv","2443222")
			);
	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}

}
