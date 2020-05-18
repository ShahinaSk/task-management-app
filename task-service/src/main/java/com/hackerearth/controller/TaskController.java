package com.hackerearth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackerearth.domain.Task;
import com.hackerearth.exception.TaskAlreadyExistsException;
import com.hackerearth.exception.TaskNotFoundException;
import com.hackerearth.service.TaskService;

@RestController
@RequestMapping("api/v1")
@CrossOrigin("*")
public class TaskController {

	private TaskService taskService;

	@Autowired
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}

	@PostMapping("task")
	public ResponseEntity<?> save(@RequestBody Task task){
		try {
			Task task1=taskService.save(task);
			return new ResponseEntity<>(task1, HttpStatus.CREATED);
		}catch(TaskAlreadyExistsException e) {
			return new ResponseEntity<>("Doctor Already Exists",HttpStatus.CONFLICT);
		}
	}
	
	@GetMapping("task/{taskId}")
	public ResponseEntity<?> get(@PathVariable Integer taskId){
		try {
			return new ResponseEntity<>(taskService.getTask(taskId),HttpStatus.FOUND);
		} catch (TaskNotFoundException e) {
			return new ResponseEntity<>("Task Doesn't exists", HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("task")
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<> (taskService.getAllTasks(),HttpStatus.OK);
	}

	@PutMapping("task")
	public ResponseEntity<?> update(@RequestBody Task task){
		try {
			Task task1=taskService.update(task);
			return new ResponseEntity<>(task1, HttpStatus.CREATED);
		}catch(TaskNotFoundException e) {
			return new ResponseEntity<>("Task Doesn't Exists",HttpStatus.CONFLICT);
		}
	}
	
	@DeleteMapping("task/{taskId}")
	public ResponseEntity<?> delete(@PathVariable Integer taskId){
		try {
			return new ResponseEntity<>(taskService.delete(taskId),HttpStatus.OK);
		} catch (TaskNotFoundException e) {
			return new ResponseEntity<>("Task Doesn't exists", HttpStatus.NOT_FOUND);
		}
	}
}
