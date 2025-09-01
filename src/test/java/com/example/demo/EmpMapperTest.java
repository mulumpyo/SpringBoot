package com.example.demo;

import java.util.Date;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.emp.mapper.EmpMapper;
import com.example.demo.emp.mapper.EmpVO;

@SpringBootTest
public class EmpMapperTest {

	@Autowired
	EmpMapper empMapper;
	
	@Test @DisplayName("사원 수")
	public void selectCount() {
		System.out.println(empMapper.selectCount());
	}
	
//	@Test @DisplayName("전체조회")
	public void selectEmp() {
		empMapper.selectEmp().forEach(emp -> System.out.println(emp.getLastName()));
	}
	
//	@Test @DisplayName("단건조회")
	public void selectEmpById() {
		System.out.println(empMapper.selectEmpById("100").getFirstName());
	}
	
//	@Test @DisplayName("등록") 
	public void insertEmp() {
		EmpVO emp = EmpVO
						.builder()
						.employeeId("900")
						.email("a@aa")
						.lastName("ㅎ헤헤ㅔ헿")
						.jobId("IT_PROG")
						.hireDate(new Date())
						.build();
		int result = empMapper.insertEmp(emp);
		System.out.println(result);
	}
	
}
