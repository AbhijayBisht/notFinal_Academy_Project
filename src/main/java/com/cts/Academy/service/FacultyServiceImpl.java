package com.cts.Academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.Faculty;
import com.cts.Academy.bean.ReportManagementPage;
import com.cts.Academy.bean.SkillSet;
import com.cts.Academy.dao.FacultyDAO;

@Service("facultyService")
public class FacultyServiceImpl implements FacultyService{
	
	@Autowired
	private FacultyDAO facultyDAO;
	
	@Override
	public String addFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return facultyDAO.addFaculty(faculty);
	}

	@Override
	public String deleteFaculty(String Faculty_Id) {
		// TODO Auto-generated method stub
    	return facultyDAO.deleteFaculty(Faculty_Id);
	}

	@Override
	public Faculty getFaculty(String id) {
		// TODO Auto-generated method stub
		return facultyDAO.getFaculty(id);
	}

	@Override
	public List<Faculty> getAllFaculty() {
		// TODO Auto-generated method stub
		return facultyDAO.getAllFaculty();
	}

	@Override
	public String addSkill(SkillSet skillset) {
		// TODO Auto-generated method stub
		return facultyDAO.addSkill(skillset);
	}

	@Override
	public String addReportManagementPage(ReportManagementPage reportmanagementpage) {
		// TODO Auto-generated method stub
		return facultyDAO.addReportManagementPage(reportmanagementpage);
	}

}
