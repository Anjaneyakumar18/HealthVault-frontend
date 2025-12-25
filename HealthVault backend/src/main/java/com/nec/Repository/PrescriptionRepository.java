package com.nec.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Prescriptions;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescriptions, Long> {

	@Query(value=""
			+ "select * from doctor d join prescriptions p on p.doctor_id=d.doctor_id",nativeQuery=true)
	List<Object[]> findByPatientId(Long patientId);

}
