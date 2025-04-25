
package com.example.project.serviceimpl;

import com.example.project.model.Appointment;
import com.example.project.model.Doctor;
import com.example.project.model.Patient;
import com.example.project.repository.AppointmentRepository;
import com.example.project.service.AppointmentService;
import com.example.project.service.DoctorService;
import com.example.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentImpl  implements AppointmentService {



    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    PatientService patientService;

    @Autowired
    DoctorService doctorService;

    @Override
    public Appointment addAppointment(int patientId,int doctorId,Appointment appointment) {
        Patient patient = patientService.getPatientById(patientId);
        Doctor doctor = doctorService.getDoctorById(doctorId);
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        return appointmentRepository.save(appointment);
    }

    @Override
    public List<Appointment> getAppointmentByDoctorId(int doctorId) {
        return appointmentRepository.findByDoctorDoctorID(doctorId);
    }
/*
    @Override
    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentById(int appointmentId) {
        return appointmentRepository.findById(appointmentId).get();
    }*/
}

