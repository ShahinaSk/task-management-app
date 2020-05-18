package com.hackerearth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hackerearth.domain.Task;
import com.hackerearth.exception.TaskAlreadyExistsException;
import com.hackerearth.exception.TaskNotFoundException;

@Service
public interface TaskService {

	Task save(Task task) throws TaskAlreadyExistsException;
	Task update(Task task) throws TaskNotFoundException;
	List<Task> getAllTasks();
	Task getTask(Integer taskId) throws TaskNotFoundException;
	String delete(Integer taskId) throws TaskNotFoundException;
	
}
