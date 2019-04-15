package com.cts.Academy.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Faculty;
import com.cts.Academy.bean.Module;
import com.cts.Academy.bean.ReportManagementPage;
import com.cts.Academy.bean.SkillSet;

@Repository("facultyDAO")
@Transactional
public class FacultyDAOImpl implements FacultyDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private FacultyDAO facultyDAO;
	
	@Override
	public String addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(faculty);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
}

	@Override
	public String deleteFaculty(String Faculty_Id) {
		// TODO Auto-generated method stub
		try {
			Faculty faculty= facultyDAO.getFaculty(Faculty_Id);
			sessionFactory.getCurrentSession().delete(faculty);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public Faculty getFaculty(String id) {
		// TODO Auto-generated method stub
		Faculty faculty = null;
		try {
			faculty = sessionFactory.getCurrentSession().load(Faculty.class, id);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println(faculty);
		return faculty;
	}

	@Override
	public String addSkill(SkillSet skillset) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(skillset);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String addReportManagementPage(ReportManagementPage reportmanagementpage) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(reportmanagementpage);
			return "success";
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
}

	@Transactional(readOnly=true)
	public List<Faculty> getAllFaculty() {
		Session session=null;
		SessionFactory sessionFactory = null;
		String query ="from Faculty";
		org.hibernate.query.Query<Faculty> query2 = null;
		try{
			session = sessionFactory.openSession();
			query2= session.createQuery(query);
			List<Faculty> list = query2.getResultList();
			return list;
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				if (session != null) {
			        session.close();
			      }
			}	
		return null;
	}
}