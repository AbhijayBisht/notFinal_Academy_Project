package com.cts.Academy.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Module;

@Repository("moduleDAO")
@Transactional
public class ModuleDAOImpl implements ModuleDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addModulePage(Module module) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(module);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}

	@Transactional(readOnly=true)
	public List<Module> getAllModule() {
		Session session=null;
		SessionFactory sessionFactory = null;
		String query ="from Module";
		org.hibernate.query.Query<Module> query2 = null;
		try{
			session = sessionFactory.openSession();
			query2= session.createQuery(query);
			List<Module> list = query2.getResultList();
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