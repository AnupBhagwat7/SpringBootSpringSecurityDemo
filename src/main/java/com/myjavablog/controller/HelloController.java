/**
 * 
 */
package com.myjavablog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author anupb
 *
 */

@Controller
public class HelloController {

	
	@GetMapping("/hello")
	public String getHomePage(Model model) {
		
		model.addAttribute("message", "Lets make our app secure");
		
		return "hello";
		
	}
	
	@GetMapping("/")
	public String getIndexPage() {
		
		return "index";
		
	}
	
}
