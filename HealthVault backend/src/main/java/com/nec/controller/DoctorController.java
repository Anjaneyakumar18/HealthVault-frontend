package com.nec.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.DTO.DoctorDTO;
import com.nec.DTO.LabDTO;
import com.nec.DTO.PrescriptionDTO;
import com.nec.Entity.Appointment;
import com.nec.Entity.Docter;
import com.nec.Services.DoctorService;

@RestController
@RequestMapping("/doctor")
@CrossOrigin("*")
public class DoctorController {
	
	DoctorService ds;
	public DoctorController(DoctorService ds) {
		this.ds=ds;
	}
	
	@PostMapping("/addnewdoc")
	public void addNewDoc(@RequestBody DoctorDTO dd) {
		this.ds.addNewDoctor(dd);
	}
	
	@GetMapping("/getalldocs")
	List<Docter> getAllDocs(){
		return this.ds.getAllDoctors();
	}
	
	@PostMapping("/doctorsuggestions")
	List<Docter> docterSuggestions(@RequestBody DoctorDTO dd){
		return this.ds.getDoctorSuggessions(dd.getDoctorName());
	}
	
	@DeleteMapping("/deletedoctor")
	void deleteDoctor(@RequestBody DoctorDTO dd) {
		this.ds.deleteDoctor(dd.getDoctorId());
	}
	
	@PostMapping("/writeprescription")
	boolean writePrescription(@RequestBody PrescriptionDTO pd) {
		return this.ds.writePrescription(pd);
		
	}
	
	@PostMapping("/gettodayappointments")
	List<Object[]> getTodayAppointments(@RequestBody DoctorDTO dd){
		return this.ds.getTodayAppointments(dd.getDoctorId());
	}
	
	@PostMapping("/insertlab")
	void insertLab(@RequestBody LabDTO ld) {
		this.ds.insertLab(ld);
	}
	

}
