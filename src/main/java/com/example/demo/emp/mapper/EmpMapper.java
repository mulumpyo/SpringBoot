package com.example.demo.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper // 인터페이스 구현클래스를 생성(싱글톤)해서 스프링 컨테이너 빈 등록
public interface EmpMapper {
	List<EmpVO> selectEmp();
	EmpVO selectEmpById(String employeeId);
	int insertEmp(EmpVO emp);
	Long selectCount();
}