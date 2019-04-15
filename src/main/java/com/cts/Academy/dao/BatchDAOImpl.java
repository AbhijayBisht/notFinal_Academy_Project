package com.cts.Academy.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.Academy.bean.Batch;
import com.cts.Academy.bean.BatchAllocationPage;
import com.cts.Academy.bean.FacultyCredit;
import com.cts.Academy.bean.ReportManagementPage;

@Repository("batchDAO")
@Transactional
public class BatchDAOImpl implements BatchDAO{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addBatchAllocationPage(BatchAllocationPage batchAllocationPage) {
		// TODO Auto-generated method stub		
		try {
			sessionFactory.getCurrentSession().save(batchAllocationPage);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}

	@Override
	public String addBatch(Batch batch) {
		// TODO Auto-generated method stub
		try {
			sessionFactory.getCurrentSession().save(batch);
			return "success";
		} catch (HibernateException e) {
			e.printStackTrace();
			return "fail";
		}
	}

	@Transactional(readOnly=true)
	public List<Batch> getAllBatch() {
		Session session=null;
		SessionFactory sessionFactory = null;
		String query ="from Batch";
		org.hibernate.query.Query<Batch> query2 = null;
		try{
			session = sessionFactory.openSession();
			query2= session.createQuery(query);
			List<Batch> list = query2.getResultList();
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

	@Transactional(readOnly=true)
	public ReportManagementPage getFeedback(String Batch_Id) {
		// TODO Auto-generated method stub
		Session session =null;
		SessionFactory sessionFactory = null;
		String query ="from ReportManagementPage where Batch_Id =?";
		org.hibernate.query.Query<ReportManagementPage> query2 = null;
		try{
			session = sessionFactory.openSession();
			query2= session.createQuery(query);
			query2.setParameter(0, Batch_Id);
			    ReportManagementPage reportManagementPage = new ReportManagementPage();
				reportManagementPage = query2.getSingleResult();
				return reportManagementPage; 
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}

	@Transactional(readOnly=true)
	public FacultyCredit getFacultyCredit(String Batch_Id) {
		// TODO Auto-generated method stub
		Session session =null;
		SessionFactory sessionFactory = null;
		String query ="from FacultyCredit where Batch_Id =?";
		org.hibernate.query.Query<FacultyCredit> query2 = null;
		try{
			session = sessionFactory.openSession();
			query2= session.createQuery(query);
			query2.setParameter(0, Batch_Id);
				FacultyCredit facultyCredit = new FacultyCredit();
				facultyCredit = query2.getSingleResult();
				return facultyCredit; 
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
}