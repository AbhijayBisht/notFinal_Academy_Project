package com.cts.Academy.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Batch {
	@Id
	@Column
	String Batch_Id;
	@Column
	String Batch_Name;
	@Column
	String Batch_Details;
	
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBatch_Id() {
		return Batch_Id;
	}
	public void setBatch_Id(String batch_Id) {
		Batch_Id = batch_Id;
	}
	public String getBatch_Name() {
		return Batch_Name;
	}
	public void setBatch_Name(String batch_Name) {
		Batch_Name = batch_Name;
	}
	public String getBatch_Details() {
		return Batch_Details;
	}
	public void setBatch_Details(String batch_Details) {
		Batch_Details = batch_Details;
	}
	
}
