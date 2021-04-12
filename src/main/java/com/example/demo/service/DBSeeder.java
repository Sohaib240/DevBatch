package com.example.demo.service;

import com.example.demo.Model.OutPatient;
import com.example.demo.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public void run(String... strings) throws Exception {
		List<OutPatient> patients = new ArrayList<>();
		patients.add(OutPatient.builder()
				.patientId("1")
				.hosp(123)
				.sessionId(1)
				.docCode("soh")
				.teamCode("asl")
				.opBookingsId(70)
				.build());
		patients.add(OutPatient.builder()
				.patientId("2")
				.hosp(456)
				.sessionId(2)
				.docCode("adr")
				.teamCode("ras")
				.opBookingsId(71)
				.build());
		this.patientRepository.deleteAll();
		this.patientRepository.saveAll(patients);
	}
}
