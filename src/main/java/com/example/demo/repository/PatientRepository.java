package com.example.demo.repository;

import com.example.demo.Model.OutPatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<OutPatient, Long> {
	OutPatient findByTeamCodeAndHospAndDocCode(String teamCode, int hosp, String docCode);
}
