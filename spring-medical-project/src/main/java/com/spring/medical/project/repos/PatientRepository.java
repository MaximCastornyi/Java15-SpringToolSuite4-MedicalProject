package com.spring.medical.project.repos;

import org.springframework.data.repository.CrudRepository;

import com.spring.medical.project.entities.Patient;

public interface PatientRepository extends CrudRepository<Patient, Long> {

}
