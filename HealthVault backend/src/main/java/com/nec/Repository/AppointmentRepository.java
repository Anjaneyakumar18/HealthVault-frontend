package com.nec.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
			@Query(
					  value = "SELECT * FROM appointment a " +
					          "JOIN patient p ON p.patient_id = a.patient_id " +
					          "WHERE a.doctor_id = :doctorId " +
					          "AND DATE(a.`date`) = CURDATE() " +
					          "ORDER BY a.`date` ASC",
					  nativeQuery = true
					)
			List<Object[]> findTodayAppointments(@Param("doctorId") Long doctorId);

	
}
