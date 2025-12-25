package com.nec.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Patient;

import jakarta.transaction.Transactional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

	@Query(value = "SELECT pd.id as appointmentId, d.doctor_name as doctorName, d.specialization, " +
            "p.patient_name as patientName, p.patient_email as patientEmail, pd.appointment_date as appointmentDate " +
            "FROM doctor d " +
            "JOIN patientdoctor pd ON pd.doctor_id = d.doctor_id " +
            "JOIN patient p ON p.patient_id = pd.patient_id " +
            "WHERE pd.patient_id = :patientId", 
    nativeQuery = true)
	List<Object[]> getPrevCol(Long patientId);

	List<Patient> findByPatientId(Long patientId);
	
	@Transactional
	@Modifying
	@Query(value="update patient "
			+ "set blood_group=:bloodGroup,medical_history=:medicalHistory,habits=:habits "
			+ "where patient_id=:patientId",nativeQuery=true)
	void setBloodGroup(@Param("patientId") long PatientId,@Param("bloodGroup") String bloodGroup,
			@Param("medicalHistory") String medicalHistory,@Param("habits") String habits);

	
}
