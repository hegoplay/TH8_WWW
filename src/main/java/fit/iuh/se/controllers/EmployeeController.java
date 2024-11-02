package fit.iuh.se.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fit.iuh.se.services.EmployeeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Controller
@RequestMapping("/employees")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class EmployeeController {
	
	EmployeeService service;
	
	@GetMapping
	public String getList() {
		return "index";
	}
}
