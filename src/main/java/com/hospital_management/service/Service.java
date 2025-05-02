package com.hospital_management.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.hospital_management.entity.Doctors;
import com.hospital_management.entity.Doctors.Availability;
import com.hospital_management.repository.Repository;

@org.springframework.stereotype.Service
public class Service {
	
	private Repository repository;

	public Service(Repository repository) {
		this.repository = repository;
	}
	
	public Doctors addDoc(Doctors docters) {
		return repository.save(docters);
	}
	
	public Page<Doctors> getAllDoc(int no) {
	return repository.findAll(PageRequest.of(no, 5,Sort.by("id").ascending())));
	}

	public Doctors updateDoctor(Doctors doctor) {
		
		
		Doctors updatedDoctor=repository.findById(doctor.getId()).orElseThrow(()->new RuntimeException("Not Found With This Id"));
		
		updatedDoctor.setName(doctor.getName());
		updatedDoctor.setSpecialization(doctor.getSpecialization());
		updatedDoctor.setExperiance(doctor.getExperiance());
		updatedDoctor.setDegree(doctor.getDegree());
		updatedDoctor.setHospitalName(doctor.getHospitalName());
		updatedDoctor.setFees(doctor.getFees());
		updatedDoctor.setStatus(doctor.getStatus());
		
		return repository.save(updatedDoctor);
	}
	
	
	public void deleteDoctor(long id) {
		repository.deleteById(id);;
	}

}
