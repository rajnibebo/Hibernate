/**
 * 
 */
package com.rajni.ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author rajni.ubhi
 *
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@GetMapping("/create")
	public String create() {
		return "employee/empCreateOrUpdate";
	}
}
