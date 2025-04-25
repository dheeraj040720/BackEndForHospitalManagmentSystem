package com.example.project.controller;

import com.example.project.model.Appointment;
import com.example.project.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/{patientID}/{doctorID}")
    public ResponseEntity<Appointment> addAppointment(@PathVariable("patientID") int patientId, @PathVariable("doctorID") int doctorId,@RequestBody Appointment appointment) {
        System.out.println(patientId);
        System.out.println(doctorId);
        System.out.println(appointment);
        return new ResponseEntity<Appointment>(appointmentService.addAppointment(patientId,doctorId,appointment), HttpStatus.CREATED);
    }

    @GetMapping("/getappointbydoctorId/{doctorId}")
    public List<Appointment> getAppointmentsByDoctorId(@PathVariable("doctorId") int doctorId)
    {
        return appointmentService.getAppointmentByDoctorId(doctorId);
    }

}