package com.pro.wings.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.wings.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public boolean addEmployee(Employee entity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction txn = session.beginTransaction();
			session.save(entity);
			txn.commit();
			session.close();
			return true;
		} catch (Exception e) {
			System.out.println("Not able to store employee!!!!");
			e.printStackTrace();
			return false;
		}

	}

}
