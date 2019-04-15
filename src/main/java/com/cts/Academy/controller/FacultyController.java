package com.cts.Academy.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.Academy.bean.FacultyCredit;
import com.cts.Academy.bean.SkillSet;
import com.cts.Academy.service.AdminService;
import com.cts.Academy.service.FacultyService;

@Controller("Faculty")
public class FacultyController {
	
	@Autowired
	FacultyService facultyService;
	@Autowired
	AdminService adminService;
	
	@RequestMapping(value="Add-FacultySkill.html")
	public String getLogin(){
		return "Add-FacultySkill";
	}
	@RequestMapping(value="Add-FacultyCreditSkill.html")
	public String getLogin1(){
		return "Add-FacultyCreditSkill";
	}
	
	@RequestMapping(value="Add-FacultySkill.html",method=RequestMethod.POST)
	public ModelAndView addFacultySkill(@ModelAttribute SkillSet skillset){
		String s= facultyService.addSkill(skillset);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Report-Management");
		modelAndView.addObject("facultys",facultyService.addSkill(skillset));
		}
		else{
			modelAndView.setViewName("Report-Management");
		}
		return modelAndView;
	}
	@RequestMapping(value="Add-FacultyCreditSkill.html",method=RequestMethod.POST)
	public ModelAndView addFacultyCreditSkill(@ModelAttribute FacultyCredit facultyCredit){
		String s= adminService.insertFacultyCredit(facultyCredit);
		ModelAndView modelAndView = new ModelAndView();
		if(s=="success")
		{
		modelAndView.setViewName("Report-Management");
		modelAndView.addObject("facultys",adminService.insertFacultyCredit(facultyCredit));
		}
		else{
			modelAndView.setViewName("Report-Management");
		}
		return modelAndView;
	}	
}
