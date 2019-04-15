package com.cts.Academy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.Academy.bean.Batch;
import com.cts.Academy.bean.BatchAllocationPage;
import com.cts.Academy.bean.FacultyCredit;
import com.cts.Academy.bean.ReportManagementPage;
import com.cts.Academy.dao.BatchDAO;

@Service("batchService")
public class BatchServiceImpl implements BatchService{

	@Autowired
	BatchDAO batchDAO;

	@Override
	public String addBatchAllocationPage(BatchAllocationPage batchAllocationPage) {
		return batchDAO.addBatchAllocationPage(batchAllocationPage);
	}

	@Override
	public String addBatch(Batch batch) {
		return batchDAO.addBatch(batch);
	}

	@Override
	public List<Batch> getAllBatch() {
		// TODO Auto-generated method stub
		return batchDAO.getAllBatch();
	}

	@Override
	public ReportManagementPage getFeedback(String batchId) {
		// TODO Auto-generated method stub
		return batchDAO.getFeedback(batchId);
	}

	@Override
	public FacultyCredit getFacultyCredit(String Batch_Id) {
		// TODO Auto-generated method stub
		return batchDAO.getFacultyCredit(Batch_Id);
	}
}