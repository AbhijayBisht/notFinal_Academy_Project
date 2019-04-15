package com.cts.Academy.dao;

import java.util.List;

import com.cts.Academy.bean.Module;

public interface ModuleDAO {
	public String addModulePage(Module module);
	public List<Module> getAllModule();

}