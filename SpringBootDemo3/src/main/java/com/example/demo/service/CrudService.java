package com.example.demo.service;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repo.MyRepo;
@Service

public class CrudService {
	@Autowired
	private MyRepo repo;
 
	 public List<Patient> fetchPatientList(){
 
		 return repo.findAll();
		 }
 
	public Optional<Patient> fetchPatientListById(int id) {
 
		return repo.findById(id); 
 
	}

	public Patient savePatientToBD(Patient patient) {
		
		return repo.save (patient);
		
	}
 
	public String deletePatientListById(int id) {
 
			String result;
			try {
					repo.deleteById(id);
 
					result="Deleted";
 
			}
			catch (Exception e) {
				result="Not Deleted";
			}
			return result;
 
	}
}
