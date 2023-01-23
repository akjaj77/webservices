package com.guides.springboot.registrationlogin.repository.service;



public class UserService {
	oid saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();

}
