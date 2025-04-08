package com.example.project.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.model.Patient;
import com.example.project.repository.PatientRepository;
import com.example.project.service.PatientService;
import com.example.project.service.atientService;

@Service
	public class PatientSericeimpl implements PatientService{
	@Autowired
	PatientRepository patientRepository;

	@Override
	public Patient addPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient getPatientById(int patientID) {
		// TODO Auto-generated method stub
		return patientRepository.findById(patientID).get();
	}

	@Override
	public void removePatientById(int patientID) {
		// TODO Auto-generated method stub
		Patient patient =getPatientById(patientID);
		patientRepository.deleteById(patientID);
	}

	@Override
	public Patient updatePatientById(int patientId, Patient newpatient) {
		// TODO Auto-generated method stub
		Patient existingPatient=getPatientById(patientId);
		existingPatient.setAddress(newpatient.getAddress());
		existingPatient.setName(newpatient.getName());
		existingPatient.setEmail(newpatient.getEmail());
		existingPatient.setGender(newpatient.getGender());
		existingPatient.setPhoneNum(newpatient.getPhoneNum());
		
		
		return patientRepository.save(newpatient)  ;
	}

	}


