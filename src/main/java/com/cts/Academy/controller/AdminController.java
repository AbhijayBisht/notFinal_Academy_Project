package com.cts.Academy.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.BatchAllocationPage;
import com.cts.Academy.bean.Faculty;
import com.cts.Academy.bean.Login;
import com.cts.Academy.bean.Module;
import com.cts.Academy.service.BatchService;
import com.cts.Academy.service.FacultyService;
import com.cts.Academy.service.ModuleService;


@Controller("Admin")
public class AdminController {
	
	@Autowired
	FacultyService facultyService;
	@Autowired
	ModuleService moduleService;
	@Autowired
	BatchService batchService;
	
	@Autowired
	SessionFactory getSessionFactory;
	
	@RequestMapping(value="Admin-AddFaculty.html")
	public String getAddFaculty(){
		return "Admin-AddProduct";
	}
	
	@RequestMapping(value="Admin-AddModule.html")
	public String getAddModulePage(){
		return "Admin-AddModule";
	}
	
	@RequestMapping(value="Admin-AddBatchPage.html")
	public String getbatchAllocationPage(){
		return "Admin-batchAllocationPage";
	}
	@RequestMapping(value="deleteProduct.html")
	public ModelAndView getDeleteFaculty(@ModelAttribute Faculty faculty , @RequestParam("id") String id){
		ModelAndView mav= new ModelAndView();
		facultyService.deleteFaculty(faculty.getFaculty_Id());
		mav.setViewName("Admin-Controls");
		return mav;
	}
	
	@RequestMapping(value="Add-AddFaculty.html",method=RequestMethod.POST)
	public ModelAndView insertFaculty(@ModelAttribute Faculty faculty){
		String s= facultyService.addFaculty(faculty);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("facultys",facultyService.addFaculty(faculty));
		}
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="Add-AddModule.html",method=RequestMethod.POST)
	public ModelAndView insertModulePage(@ModelAttribute Module module){
		String s= moduleService.addModulePage(module);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("modules",moduleService.addModulePage(module));
		}
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}
	
	@RequestMapping(value="Add-AddBatchPage.html",method=RequestMethod.POST)
	public ModelAndView insertbatchAllocationPage(@ModelAttribute BatchAllocationPage batchAllocationPage){
		String s= batchService.addBatchAllocationPage(batchAllocationPage);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Admin-Controls");
		modelAndView.addObject("batchs",batchService.addBatchAllocationPage(batchAllocationPage));
		}		
		else{
			modelAndView.setViewName("Admin-Controls");
		}
		return modelAndView;
	}
	
}
