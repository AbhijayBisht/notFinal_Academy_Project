package com.cts.Academy.dao;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.FacultyCredit;

@Repository("adminDAO")
@Transactional
public class AdminDAOImpl  implements AdminDAO{

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String insertFacultyCredit(FacultyCredit facultyCredit) {
		try {
			sessionFactory.getCurrentSession().save(facultyCredit);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}
}