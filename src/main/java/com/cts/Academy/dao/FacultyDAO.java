package com.cts.Academy.dao;

import java.util.List;

import com.cts.Academy.bean.Faculty;
import com.cts.Academy.bean.ReportManagementPage;
import com.cts.Academy.bean.SkillSet;

public interface FacultyDAO {

	public String addFaculty(Faculty faculty);
	public Faculty getFaculty(String id);
	public String deleteFaculty(String Faculty_Id);
	public String addSkill(SkillSet skillset);
	public String addReportManagementPage(ReportManagementPage reportmanagementpage);
	public List<Faculty> getAllFaculty();
}