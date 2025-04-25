package com.example.project.controller;

import com.example.project.model.Doctor;
import com.example.project.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;




    @PostMapping
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){

        return  new ResponseEntity<Doctor>(doctorService.addDoctor(doctor), HttpStatus.CREATED);
    }


   @PostMapping("/logindoctor")
    public ResponseEntity<Doctor> loginDoctor(@RequestBody Doctor doctor){
        return new ResponseEntity<Doctor>(doctorService.loginDoctor(doctor),HttpStatus.OK);


    }

    @GetMapping
    public List<Doctor> getAllDoctor() {

        return doctorService.getAllDoctor();
    }

    @GetMapping("/{doctorId}")
    public  ResponseEntity<Doctor> getDoctorById(@PathVariable("doctorId") int doctorId)
    {
        return  new ResponseEntity<Doctor>(doctorService.getDoctorById(doctorId),HttpStatus.CREATED);
    }




    @DeleteMapping("/{doctorId}")
    public ResponseEntity<String> removeDoctorById(@PathVariable("doctorId") int doctorId)
    {
        doctorService.deleteDoctorById(doctorId);
        return  new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
    }

    @DeleteMapping("/getdoctorafterdelete/{doctorID}")
    public List<Doctor> removeDoctorByID1(@PathVariable("doctorID") int doctorID)
    {
        doctorService.deleteDoctorById(doctorID);
        return  doctorService.getAllDoctor();



    }

@PutMapping("/{doctorID}")

    public ResponseEntity<Doctor> updateDoctor(@PathVariable("doctorID") int doctorID, @RequestBody Doctor doctor)
    {
        Doctor docedit = doctorService.getDoctorById(doctorID);

        docedit.setDoctorName(doctor.getDoctorName());
        docedit.setDoctorDepartment(doctor.getDoctorDepartment());
        docedit.setDoctorEmail(doctor.getDoctorEmail());
        docedit.setDoctorPhoneNumber(doctor.getDoctorPhoneNumber());
        docedit.setDoctorSpecialization(doctor.getDoctorSpecialization());




        return  new ResponseEntity<Doctor>(doctorService.updateDoctorById(doctorID,doctor),HttpStatus.OK);
    }


}
