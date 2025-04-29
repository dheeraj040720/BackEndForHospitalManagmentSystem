
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
    public Appointment addAppointment(int patientId, int doctorId, Appointment appointment) {

        if (appointmentRepository.existsByPatient_PatientIDAndDoctor_DoctorIDAndAppointmentDateAndAppointmentTime(patientId, doctorId, appointment.getAppointmentDate(), appointment.getAppointmentTime())) {

            throw new RuntimeException("AN appointment already exists for this patient and doctor on specified date");
        }

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

    @Override
    public List<Appointment> getAppointmentByPatientId(int patientId) {
        return appointmentRepository.findByPatientPatientID(patientId);
    }

    @Override
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }

    @Override
    public List<Appointment> removeAppointmentById(int appointmentid) {

        appointmentRepository.deleteById(appointmentid);


        return appointmentRepository.findAll();
    }

    @Override
    public Appointment getAppointmentByAppointmentId(int appointmentid) {
        return appointmentRepository.findById(appointmentid).get();
    }

    @Override
    public boolean checkAppointmentExists(int patientId, int doctorId, String appointmentDate, String appointmentTime) {
        return appointmentRepository.existsByPatient_PatientIDAndDoctor_DoctorIDAndAppointmentDateAndAppointmentTime(
                patientId, doctorId, appointmentDate, appointmentTime);
    }

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


