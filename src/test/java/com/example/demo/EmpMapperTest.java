package com.example.demo;

import java.util.Date;
import java.util.List;

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
	
//	@Test @DisplayName("사원 수")
	public void selectCount() {
	}
	
	@Test @DisplayName("전체조회")
	public void selectEmp() {
		EmpVO vo = new EmpVO();
//		vo.setDepartmentId("50");
		vo.setFirstName("k");
		vo.setFirst(1);
		vo.setLast(20);
		List<EmpVO> list = empMapper.selectEmp(vo);
		list.forEach(emp -> System.out.println(emp.getFirstName()));
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
