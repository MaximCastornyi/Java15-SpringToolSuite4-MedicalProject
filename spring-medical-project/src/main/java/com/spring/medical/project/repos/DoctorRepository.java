package com.spring.medical.project.repos;

import org.springframework.data.repository.CrudRepository;

import com.spring.medical.project.entities.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Long> {

}
