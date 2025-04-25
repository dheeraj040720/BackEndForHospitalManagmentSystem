package com.example.project.controller;

import com.example.project.model.Patient;
import com.example.project.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.management.AttributeNotFoundException;
import java.util.List;
import java.util.ListIterator;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/patient")
public class PatientController {

    @Autowired
private PatientService patientService;



    @PostMapping
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        return  new ResponseEntity<Patient>(patientService.addPatient(patient), HttpStatus.CREATED);

    }


    @PostMapping("/loginPatient")
    public ResponseEntity<Patient> loginPatient(@RequestBody Patient patient)
    {
        return new ResponseEntity<Patient>(patientService.loginPatient(patient),HttpStatus.OK);
    }

    @GetMapping
    public List<Patient> getALlPatient() {
        return patientService.getAllPatients();
    }


    @GetMapping("/{patientID}")
    public ResponseEntity<Patient> getPatientById(@PathVariable("patientID") int patientID)
    {
        return new ResponseEntity<Patient>(patientService.getPatientById(patientID),HttpStatus.CREATED);
    }




    @DeleteMapping("/{patientID}")
    public ResponseEntity<String> removePatientById(@PathVariable("patientID") int patientID)
    {
        patientService.removePatientById(patientID);
       return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
    }
    @DeleteMapping("/getpatientafterdelete/{patientID}")
    public List<Patient> removePatientById1(@PathVariable("patientID") int patientID)

    {
        patientService.removePatientById(patientID);
        return patientService.getAllPatients();
    }


    @PutMapping("/{patientID}")
    public  ResponseEntity<Patient> updatePatient(@PathVariable("patientID") int patientID,@RequestBody Patient patient) throws AttributeNotFoundException
    {
     //   return  new ResponseEntity<Patient>(patientService.updatePatientById(patientID,patient),HttpStatus.OK);

        Patient patientre = patientService.getPatientById(patientID);


        patientre.setPatientPrescription(patient.getPatientPrescription());
        patientre.setDoctorFees(patient.getDoctorFees());
        patientre.setPatientDoasge(patient.getPatientDoasge());

        Patient updatePatient=patientService.addPatient(patientre);
        return  ResponseEntity.ok(updatePatient);
    }



}
