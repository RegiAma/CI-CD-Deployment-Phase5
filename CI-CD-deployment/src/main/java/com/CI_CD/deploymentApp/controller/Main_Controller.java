package com.CI_CD.deploymentApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main_Controller {

	 @RequestMapping("/")
	  public String index() {
	    return "index.html";
	  }
}