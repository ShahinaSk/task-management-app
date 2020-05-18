package com.hackerearth.service;

import java.util.List;
import java.util.Optional;

import com.hackerearth.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackerearth.domain.Task;
import com.hackerearth.exception.TaskAlreadyExistsException;
import com.hackerearth.exception.TaskNotFoundException;

@Service
public class TaskServiceImpl implements TaskService {

	TaskRepository taskRepository;
	public final String TASK_DOESN_T_EXIST="Task doesn't exist";
	public final String TASK_ALREADY_EXISTS="Task already exist";


	@Autowired
	public TaskServiceImpl(TaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Task save(Task task)  {
		Optional optional=taskRepository.findById(task.getTaskId());
		try {
		if (optional.isPresent())
			throw new TaskAlreadyExistsException(TASK_ALREADY_EXISTS);
			Task task1=taskRepository.save(task);
			return task1;
		} catch (TaskAlreadyExistsException e) {
			return null;
		}

	}

	@Override
	public Task update(Task task)   {
		Optional optional=taskRepository.findById(task.getTaskId());
		try {
			if (!optional.isPresent())
				throw new TaskNotFoundException(TASK_DOESN_T_EXIST);
		} catch (TaskNotFoundException e) {
		}
		Task task1=taskRepository.save(task);
		return task1;
	}

	@Override
	public List<Task> getAllTasks() {
		return taskRepository.findAll();
	}

	@Override
	public Task getTask(Integer taskId) {
		Optional optional=taskRepository.findById(taskId);
		try{
			if (!optional.isPresent())
				throw new TaskNotFoundException(TASK_DOESN_T_EXIST);
			return (Task) optional.get();
		}catch (TaskNotFoundException e){
			return null;
		}

	}

	@Override
	public String delete(Integer taskId) {
		Optional optional=taskRepository.findById(taskId);
		try{
			if (!optional.isPresent()){
				throw new TaskNotFoundException(TASK_DOESN_T_EXIST);
			}
			taskRepository.deleteById(taskId);
			return "Deleted task Successfully";
		} catch (TaskNotFoundException e) {
			return TASK_DOESN_T_EXIST;
		}
	}

}
