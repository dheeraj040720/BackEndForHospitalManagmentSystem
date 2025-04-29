package com.example.project.service;

import com.example.project.model.Appointment;
import com.example.project.model.Patient;

import java.util.List;

public interface AppointmentService {
    Appointment addAppointment(int patientId,int doctorId,Appointment appointment);
    List<Appointment> getAppointmentByDoctorId(int doctorId);

    List<Appointment> getAppointmentByPatientId(int patientId);

    public List<Appointment> getAllAppointment();
    public List<Appointment> removeAppointmentById(int appointmentid);
    public Appointment  getAppointmentByAppointmentId(int appointmentid);



    /*List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int appointmentId);*/
    public boolean checkAppointmentExists(int patientId, int doctorId, String appointmentDate, String appointmentTime);
}
