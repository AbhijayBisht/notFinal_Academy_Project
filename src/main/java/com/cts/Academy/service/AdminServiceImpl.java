package com.cts.Academy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.FacultyCredit;
import com.cts.Academy.dao.AdminDAO;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminDAO adminDAO;

	@Override
	public String insertFacultyCredit(FacultyCredit facultyCredit) {
		// TODO Auto-generated method stub
		return adminDAO.insertFacultyCredit(facultyCredit);
	}
}