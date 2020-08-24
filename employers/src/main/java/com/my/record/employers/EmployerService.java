package com.my.record.employers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;




@Service
public class EmployerService {


	@Autowired
	private EmployerRepository employerRepository;

	/*private List<Employer> employers = new ArrayList<> (Arrays.asList(
			new Employer("Jo","XI","HEDGATAN",890701344),
			new Employer("ZI","XI","HEDGATAN",890891344),
			new Employer("KIM","JOHN","ZEDGATAN",80701344)));*/

	public List<Employer> getAllEmployers(){
		List<Employer> employers = new ArrayList<>();
		employerRepository.findAll().forEach(employers::add);
		return employers;

	}
	public Employer getEmployer(String id){
		return employerRepository.findById(id).orElse(null);

	}
	public void addEmployer(Employer employer){
		employerRepository.save(employer);

	}
	public void updateEmployer(String id,Employer employer) {
		/*for (int i = 0; i < employers.size(); i++) {
			Employer t = employers.get(i);
			if (t.getId().equals(id)) {
				employers.set(i, employer);
				return;
			}*/

		employerRepository.save(employer);

	}
	public void deleteEmployer(String id) {
		//employers.removeIf(t -> t.getId().equals(id));
		employerRepository.deleteById(id);
	}

}