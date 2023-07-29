package com.wb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wb.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,String>
{

}
