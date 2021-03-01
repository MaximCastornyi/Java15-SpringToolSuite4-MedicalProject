package com.spring.medical.project.repos;

import org.springframework.data.repository.CrudRepository;

import com.spring.medical.project.entities.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {

}
