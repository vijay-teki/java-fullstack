package com.example.vijay.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.vijay.model.LoginUser;

@Repository
public interface LoginUserRepo extends MongoRepository<LoginUser, String> {
	
	
}
