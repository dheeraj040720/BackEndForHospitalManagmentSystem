package com.example.project.service;

import com.example.project.model.Doctor;

import java.util.List;

public interface DoctorService {



    public Doctor addDoctor(Doctor doctor);

    public List<Doctor> getAllDoctor();

    public Doctor getDoctorById(int doctorID);

    public void deleteDoctorById(int doctorID);

    public Doctor updateDoctorById(int doctorID,Doctor doctor);

    public Doctor loginDoctor(Doctor doctor);

}
