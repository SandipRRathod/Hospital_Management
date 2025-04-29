package com.hospital_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital_management.entity.Doctors;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Doctors, Long> {

}
