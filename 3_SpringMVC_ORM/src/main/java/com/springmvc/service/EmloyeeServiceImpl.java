package com.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.dao.EmployeeDao;
import com.springmvc.entitie.Employee;

@Service
public class EmloyeeServiceImpl implements EmployeeService 
{
	@Autowired
	private EmployeeDao employeeDao;
	
	public int save(Employee employee) 
	{
		int i=employeeDao.save(employee);
		return i;	
	}

	@Override
	public Employee loginEmp(Employee employee) {
		// TODO Auto-generated method stub
		Employee i= employeeDao.loginEmployee(employee);
		return i;
	}
	
	
	

}
