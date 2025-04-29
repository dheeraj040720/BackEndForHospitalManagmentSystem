
        package com.example.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="AppointmentDetails")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int appointmentid;

    @ManyToOne
    @JoinColumn(name="doctorID,referenceColumnName=doctorID")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="patientID,referenceColumnName=patientID")
    private Patient patient;

    private  String appointmentDate;

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    private String appointmentTime;



    public int getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(int appointmentid) {
        this.appointmentid = appointmentid;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
