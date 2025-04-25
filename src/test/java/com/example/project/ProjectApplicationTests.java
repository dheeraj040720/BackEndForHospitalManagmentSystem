package com.example.project;

import com.example.project.model.Doctor;
import com.example.project.model.Patient;
import com.example.project.service.DoctorService;
import com.example.project.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

@SpringBootTest
class ProjectApplicationTests {

	@Autowired
	PatientService patientservice;

	@Autowired
	DoctorService doctorservice;
	@Test
	void contextLoads() {
	}

@Test
	public void addPatient()
	{
		Patient patient = new Patient();
		patient.setPatientname("sumanth");

		Patient patient1 = this.patientservice.addPatient(patient);

		assertNotNull(patient1);
	}
	
	
	
	public void getUserTesting()
	{
	
		

	
	
	}
	
	
	
	
	@Test
	public void testPatientCount()
	{
		
		List<Patient> patientList=patientservice.getAllPatients();
		assertTrue(patientList.size()>10);
		System.out.println("Test patient count");
	}
	



}
