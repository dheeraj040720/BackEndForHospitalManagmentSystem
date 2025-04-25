package com.example.project.service;

import com.example.project.model.Appointment;
import java.util.List;

public interface AppointmentService {
    Appointment addAppointment(int patientId,int doctorId,Appointment appointment);
    List<Appointment> getAppointmentByDoctorId(int doctorId);
    /*List<Appointment> getAllAppointments();
    Appointment getAppointmentById(int appointmentId);*/
}
