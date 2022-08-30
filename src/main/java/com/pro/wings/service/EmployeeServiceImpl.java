package com.pro.wings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.wings.dao.EmployeeDao;
import com.pro.wings.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public boolean addEmployee(Employee emp) {

		return empDao.addEmployee(emp);

	}

}
