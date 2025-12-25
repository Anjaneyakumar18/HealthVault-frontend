package com.nec.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Docter;

@Repository
public interface DoctorRepository extends JpaRepository<Docter, Long> {

	@Query(value="SELECT * FROM doctor WHERE doctor_name LIKE CONCAT(:doctorName, '%')", nativeQuery=true)
	List<Docter> getDocterSuggessions(@Param("doctorName") String doctorName);

	void deleteAllByDoctorId(Long doctorId);

}
