package com.my.record.employers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployerController {
	
	@Autowired
	private EmployerService employerService;
	
	//get all employers
	@RequestMapping("/employers")
	public List<Employer> getAllEmployers(){
		return employerService.getAllEmployers();
		
	}
	//Get  employer by id
	@RequestMapping("/employers/{id}")
	public Employer getEmployers(@PathVariable String id) {
		return employerService.getEmployer(id);
	}
	// add a new employer
	@RequestMapping(method=RequestMethod.POST, value = "/employers")
	public void addEmployers(@RequestBody Employer employer) {
	employerService.addEmployer(employer);
	}
	//update an employer by id
	@RequestMapping(method=RequestMethod.PUT, value = "/employers/{id}")
	public void updateEmployers(@RequestBody Employer employer, @PathVariable String id) {
	employerService.updateEmployer(id, employer);
	}
	//delete an employer by id
	@RequestMapping(method=RequestMethod.DELETE, value = "/employers/{id}")
	public void deleteEmployers(@PathVariable String id) {
	employerService.deleteEmployer(id);
	}
}
