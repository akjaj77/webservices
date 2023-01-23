package com.guides.springboot.registrationlogin.repository;


public class UserRepository xtends JpaRepository<User, Long> {
	user findByEmail(String email);
}
