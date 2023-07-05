 package com.springmvc.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.entitie.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private SessionFactory factory;
	
	@Transactional
	public int save(Employee employee)
	{
		int i=(Integer) hibernateTemplate.save(employee);
		return i;
	}
	
	public Employee loginEmployee(Employee emp)
	{
		Session session= factory.getCurrentSession();
		try{
			Query<Employee> q=session.createQuery("from employee1 where username=:username and password=:password");
			q.setParameter("username",emp.getUsername());
			q.setParameter("password", emp.getPassword());
			System.out.print("rrun");
			return q.getSingleResult();
			
		}catch(Exception e) {
			System.out.println(e);	
		}
		
//		String sql= ("from employee1 where username=:um and password=:pswd");
//		Employee em = (Employee) hibernateTemplate.execute(s -> {
//			
//			Query q =s.createQuery(sql);
//			q.setString("um",emp.getUsername());
//			q.setString("pswd",emp.getPassword());
//			return q.getSingleResult();
			
//		});
		
		return emp;
	}

}
