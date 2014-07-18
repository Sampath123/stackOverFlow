package com.hashedin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping(value ="/dashboard")
	public String getDashboardHome (Model model) {		
		return "DashboardHome";
	}

	@RequestMapping(value ="/comments")
	public String getCommentDashboard (Model model) {		
		return "CommentsDashboard";
	}
	
	@RequestMapping(value ="/editedComments")
	public String getEditedCommentDashboard (Model model) {		
		return "EditedCommentsDashboard";
	}
	
	@RequestMapping(value ="/topUser")
	public String getUserDashboard (Model model) {	
		return "UserDashboard";
	}
	

	@RequestMapping(value ="/correlation")
	public String getCorrelationDashboard (Model model) {		
		return "CorrelationDashboard";
	}
}
