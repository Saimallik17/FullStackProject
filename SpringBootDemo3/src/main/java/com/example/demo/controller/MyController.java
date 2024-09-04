package com.example.demo.controller;
import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.model.Patient;
import com.example.demo.service.CrudService;
 
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class MyController {
	@Autowired
 
	private CrudService service;
 
	@GetMapping("/getPatient")
 
	public List<Patient> fetchPatientList() {
 
		List<Patient> patient=new ArrayList<>();
		patient=service.fetchPatientList();
		return patient;
	
	}
	
	@GetMapping("/getPatient/{id}")
 
	public Patient fetchPatientListById(@PathVariable int id) {
		return service.fetchPatientListById(id).get();
	}
 
	@PostMapping("/addPatient")
	public Patient savePatientList(@RequestBody Patient patient) {
		return service.savePatientToBD(patient);
	}
	@PutMapping("/updatePatient")
	public Patient saveorUpdatePatientList(@RequestBody Patient patient) {
		return service.savePatientToBD(patient);
	}
 
	@DeleteMapping("/deletePatient/{id}")
 
	public String deletePatientListById(@PathVariable int id) {
 
	return service.deletePatientListById(id);
	}
}
