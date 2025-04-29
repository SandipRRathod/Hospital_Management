package com.hospital_management.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital_management.entity.Doctors;
import com.hospital_management.service.Service;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class Controller {

	private Service service;

	public Controller(Service service) {
		this.service = service;
	}
	
	@PostMapping("/add-doctor")
	public ResponseEntity<?> saveDoctor(@RequestBody Doctors doctor) {
		return ResponseEntity.ok(service.addDoc(doctor));
	}
	
	@GetMapping("/get-doctors/{no}")
	public ResponseEntity<Page<Doctors>> getDoctors(@PathVariable int no){
		return ResponseEntity.ok(service.getAllDoc(no));
	}
	
	@PutMapping("/update-doctor")
	public ResponseEntity<Doctors> updateDoctor(@RequestBody Doctors doctor){
		return ResponseEntity.ok(service.updateDoctor(doctor));
	}
	
	@DeleteMapping("remove-doctor/{id}")
	public ResponseEntity<?> deleteDoctor(@PathVariable long id){
		service.deleteDoctor(id);
		return ResponseEntity.ok("Doctor Deleted Succesfully..");
	}
	
}
