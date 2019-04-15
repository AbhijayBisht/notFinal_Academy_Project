package com.cts.Academy.service;

import java.util.List;

import com.cts.Academy.bean.Batch;
import com.cts.Academy.bean.BatchAllocationPage;
import com.cts.Academy.bean.FacultyCredit;
import com.cts.Academy.bean.ReportManagementPage;

public interface BatchService {
	public String addBatchAllocationPage(BatchAllocationPage batchAllocationPage);
	public String addBatch(Batch batch);
	public List<Batch> getAllBatch();
	public ReportManagementPage getFeedback(String batchId);
	public FacultyCredit getFacultyCredit(String Batch_Id);
}