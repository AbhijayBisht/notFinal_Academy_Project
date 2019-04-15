package com.cts.Academy.service;

import java.util.List;

import com.cts.Academy.bean.Module;

public interface ModuleService {
	public String addModulePage(Module module);
	public List<Module> getAllModule();
}
