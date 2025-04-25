package com.example.project.serviceimpl;


import com.example.project.model.Doctor;
import com.example.project.repository.DoctorRepository;
import com.example.project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService
{
    @Autowired
    DoctorRepository doctorRepository;



    @Override
    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    @Override
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(int doctorID) {
        return doctorRepository.findById(doctorID).get();
    }

    @Override
    public void deleteDoctorById(int doctorID) {

        Doctor doctor = getDoctorById(doctorID);
        doctorRepository.deleteById(doctorID);

    }

    @Override
    public Doctor updateDoctorById(int doctorID, Doctor newdoctor) {
        Doctor existingDoctor=getDoctorById(doctorID);
        existingDoctor.setDoctorName(newdoctor.getDoctorName());
        existingDoctor.setDoctorEmail(newdoctor.getDoctorEmail());
        existingDoctor.setDoctorID(newdoctor.getDoctorID());
        existingDoctor.setDoctorPhoneNumber(newdoctor.getDoctorPhoneNumber());
        existingDoctor.setDoctorDepartment(newdoctor.getDoctorDepartment());
        existingDoctor.setDoctorSpecialization(newdoctor.getDoctorSpecialization());






        return doctorRepository.save(newdoctor) ;
    }

    @Override
    public Doctor loginDoctor(Doctor doctor) {
        return doctorRepository.findByUsernameAndPassword(doctor.getUsername(), doctor.getPassword());
    }
}
