
package com.example.project.repository;

import com.example.project.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {



    public List<Appointment> findByDoctorDoctorID(int doctorId);
    public List<Appointment> findByPatientPatientID(int patientID);

    boolean existsByPatient_PatientIDAndDoctor_DoctorIDAndAppointmentDateAndAppointmentTime(int patientID,int doctorId, String appointmentDate,String appointmentTime);


}

