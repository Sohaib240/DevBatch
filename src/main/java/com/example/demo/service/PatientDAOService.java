package com.example.demo.service;

import com.example.demo.Model.OutPatient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientDAOService {
	@Autowired
	PatientRepository outPatientRepository;

	public OutPatient getPatient(String teamCode, int hosp, String docCode){
		return outPatientRepository.findByTeamCodeAndHospAndDocCode(teamCode, hosp, docCode);
	}
}
