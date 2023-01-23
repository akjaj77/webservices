package com.guides.springboot.registrationlogin.repository.dto;

public class UserDto {
	 private Long id;
	    private String firstName;
	    private String lastName;
	    @NotEmpty(message = "Email should not be empty")
	    private String email;
	    @NotEmpty(message = "Password should not be empty")
	    private String password;
}
