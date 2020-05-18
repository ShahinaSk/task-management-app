package com.hackerearth.domain;

import java.util.Date;

import lombok.*;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Task {

	@Id
	private Integer taskId;
	private String taskName;
	private String label;
	private Date dueDate;
	private String description;
	private String status;
	

}
