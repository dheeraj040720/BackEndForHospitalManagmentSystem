package com.example.project.service;

import java.util.List;

import com.example.project.model.Patient;



public interface PatientService {


	

		public Patient addPatient(Patient patient);
		public List<Patient> getAllPatients();
		public Patient getPatientById(int patientID);
		public void removePatientById(int patientID);
		public Patient updatePatientById(int patientId, Patient patient);
		public Patient loginPatient(Patient patient);
		
	}


