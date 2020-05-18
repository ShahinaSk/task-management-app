package com.hackerearth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.hackerearth.domain.Task;

@Repository
public interface TaskRepository extends MongoRepository<Task, Integer>{

}
