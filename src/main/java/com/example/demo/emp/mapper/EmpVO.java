package com.example.demo.emp.mapper;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmpVO extends SearchVO {

	 private String employeeId;
	 private String firstName;
	 private String lastName;
	 private String email;
	 private Date hireDate;
	 private double salary;
	 private String jobId;
	 private String departmentId;
	 private String managerId;
}
