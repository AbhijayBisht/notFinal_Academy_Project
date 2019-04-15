package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FacultyCredit {
	@Id
	@Column
	String Batch_Id;
	@Column
	String Faculty_Id;
	int BHSReport;
	@Column
	int InnovationProject;
	@Column
	int WeeklyReport;
	@Column
	int mocktestReport;
	@Column
	int total;
	
	
	public FacultyCredit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FacultyCredit [Batch_Id=" + Batch_Id + ", Faculty_Id=" + Faculty_Id + ", BHSReport=" + BHSReport
				+ ", InnovationProject=" + InnovationProject + ", WeeklyReport=" + WeeklyReport + ", mocktestReport="
				+ mocktestReport + ", total=" + total + "]";
	}
	public String getBatch_Id() {
		return Batch_Id;
	}
	public void setBatch_Id(String batch_Id) {
		Batch_Id = batch_Id;
	}
	public String getFaculty_Id() {
		return Faculty_Id;
	}
	public void setFaculty_Id(String faculty_Id) {
		Faculty_Id = faculty_Id;
	}
	public int getBHSReport() {
		return BHSReport;
	}
	public void setBHSReport(int bHSReport) {
		BHSReport = bHSReport;
	}
	public int getInnovationProject() {
		return InnovationProject;
	}
	public void setInnovationProject(int innovationProject) {
		InnovationProject = innovationProject;
	}
	public int getWeeklyReport() {
		return WeeklyReport;
	}
	public void setWeeklyReport(int weeklyReport) {
		WeeklyReport = weeklyReport;
	}
	public int getMocktestReport() {
		return mocktestReport;
	}
	public void setMocktestReport(int mocktestReport) {
		this.mocktestReport = mocktestReport;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}	
}
