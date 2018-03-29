package com.reactive.mongo.example.demo.repository;

import com.reactive.mongo.example.demo.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {

}
