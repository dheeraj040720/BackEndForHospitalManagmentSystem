package com.example.project.model;

import jakarta.persistence.*;

@Entity
@Table(name="DocterDetails")

public class Doctor {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int doctorID;
	private String doctorName;
	private String DoctorSpecialization;
	private String DoctorPhoneNumber;
	private String DoctorEmail;
	private String DoctorDepartment;

	private String username;
	private String password;

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

	@Override
	public String toString() {
		return "Doctor{" +
				"doctorID=" + doctorID +
				", doctorName='" + doctorName + '\'' +
				", DoctorSpecialization='" + DoctorSpecialization + '\'' +
				", DoctorPhoneNumber='" + DoctorPhoneNumber + '\'' +
				", DoctorEmail='" + DoctorEmail + '\'' +
				", DoctorDepartment='" + DoctorDepartment + '\'' +
				'}';
	}

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}
	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorSpecialization() {
		return DoctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		DoctorSpecialization = doctorSpecialization;
	}

	public String getDoctorPhoneNumber() {
		return DoctorPhoneNumber;
	}

	public void setDoctorPhoneNumber(String doctorPhoneNumber) {
		DoctorPhoneNumber = doctorPhoneNumber;
	}

	public String getDoctorEmail() {
		return DoctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		DoctorEmail = doctorEmail;
	}

	public String getDoctorDepartment() {
		return DoctorDepartment;
	}

	public void setDoctorDepartment(String doctorDepartment) {
		DoctorDepartment = doctorDepartment;
	}




}
