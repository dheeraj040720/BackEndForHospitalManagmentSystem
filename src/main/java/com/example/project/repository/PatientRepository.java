package com.example.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.Patient;




	@Repository
	public interface PatientRepository extends JpaRepository<Patient,Integer>
	{
		//save()-------->insert into table 
		//findAll()----->select *from table
		//findById()---->select *from table where id=?
		//deleteById()----> delete from table where id=?
		//update()---------->update table set columnname=? where id=?

	}


