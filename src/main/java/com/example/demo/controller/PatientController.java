package com.example.demo.controller;

import com.example.demo.Model.OutPatient;
import com.example.demo.Model.OutPatientSearchCriteria;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.PatientDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class PatientController {

	@Autowired
	PatientDAOService patientDAOService;

	@PostMapping("/outPatient")
	@ResponseBody
	public OutPatient getPatient(@RequestBody OutPatientSearchCriteria outPatientSearchCriteria) {
		return patientDAOService.getPatient(outPatientSearchCriteria.getTeamCode(), outPatientSearchCriteria.getHosp(), outPatientSearchCriteria.getDocCode());
	}
}
