package com.hospital_management.entity;


import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Doctors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NonNull
	private String name;
	
	private String specialization;
	
	private int experiance;
	
	private String degree;
	
	private String hospitalName;
	
	private int fees;
	
	private Availability status;
	
	public enum Availability{
		Available,
		NotAvailable
	}

}
