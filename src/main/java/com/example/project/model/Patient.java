package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="PatientDetails")

public class  Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int patientID;
	private String patientname;
	private String patientgender;

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private String patientaddress;
	private String bloodGroup;

	private int age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private  String username;
	private String password;


	public String getPatientDoasge() {
		return patientDoasge;
	}

	public void setPatientDoasge(String patientDoasge) {
		this.patientDoasge = patientDoasge;
	}

	private String patientDoasge;
	public String getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	private String patientphoneNum;

	public String getPatientPrescription() {
		return patientPrescription;
	}

	public void setPatientPrescription(String patientPrescription) {
		this.patientPrescription = patientPrescription;
	}

	public int getDoctorFees() {
		return doctorFees;
	}

	public void setDoctorFees(int doctorFees) {
		this.doctorFees = doctorFees;
	}

	private String patientemail;
	private String appointmentDate;

	private String patientPrescription;

	private  int doctorFees;

	@Override
	public String toString() {
		return "Patient{" +
				"patientID=" + patientID +
				", patientname='" + patientname + '\'' +
				", patientgender='" + patientgender + '\'' +
				", patientaddress='" + patientaddress + '\'' +
				", bloodGroup='" + bloodGroup + '\'' +
				", patientphoneNum='" + patientphoneNum + '\'' +
				", patientemail='" + patientemail + '\'' +
				'}';
	}

	public int getPatientID() {
		return patientID;
	}

	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}

	public String getPatientname() {
		return patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getPatientgender() {
		return patientgender;
	}

	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}

	public String getPatientaddress() {
		return patientaddress;
	}

	public void setPatientaddress(String patientaddress) {
		this.patientaddress = patientaddress;
	}

	public String getPatientphoneNum() {
		return patientphoneNum;
	}

	public void setPatientphoneNum(String patientphoneNum) {
		this.patientphoneNum = patientphoneNum;
	}

	public String getPatientemail() {
		return patientemail;
	}

	public void setPatientemail(String patientemail) {
		this.patientemail = patientemail;
	}
}
