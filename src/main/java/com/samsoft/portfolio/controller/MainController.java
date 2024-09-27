package com.samsoft.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/project/ecommerce/details")
	public String projectEcommerceDetails() {
		return "projects/project_ecom";
	}
	@GetMapping("/project/insurance/details")
	public String projectInsuranceDetails() {
		return "projects/project_insurance";
	}
	@GetMapping("/project/buffalo_expression/details")
	public String projectExpressionDetails() {
		return "projects/project_buffalo_expression";
	}
	@GetMapping("/project/automation_framework/details")
	public String projectAutomationDetails() {
		System.out.println("hello");
		return "projects/project_automation_framework";
	}

}
