package com.nec.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Lab;

@Repository
public interface LabRepository extends JpaRepository<Lab, Long> {

	@Query(value = "SELECT l.id AS id, l.cost AS cost, d.doctor_name AS doctorName , p.patient_name AS patientName, l.results AS results " +
            "FROM lab l " +
            "JOIN patient p ON p.patient_id = l.patient_id " +
            "JOIN doctor d ON d.doctor_id = l.doctor_id " +
            "WHERE l.patient_id = :patientId order by l.id desc", 
    nativeQuery = true)
List<Object[]> findLabsByPatientId(@Param("patientId") Long patientId);


}
