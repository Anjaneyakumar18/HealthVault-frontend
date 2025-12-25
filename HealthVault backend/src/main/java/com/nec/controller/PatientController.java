package com.nec.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nec.DTO.AppointmentDTO;
import com.nec.DTO.PatientDTO;
import com.nec.DTO.PrescriptionDTO;
import com.nec.Entity.Lab;
import com.nec.Entity.Patient;
import com.nec.Entity.Prescriptions;
import com.nec.Services.PatientService;

@RestController
@RequestMapping("/patient")
@CrossOrigin("*")
public class PatientController {
	
	PatientService ps;
	public PatientController(PatientService ps) {
		this.ps=ps;
	}
	
	@PostMapping("/prevcol")
	List<Object[]> getPrevCol(@RequestBody PatientDTO pd){
		return this.ps.getPrevCol(pd.getPatientId());
	}
	
	@PostMapping("/getlabs")
	List<Object[]> getPrevLabRecords(@RequestBody PatientDTO pd){
		return this.ps.getPrevLabRecords(pd.getPatientId());
	}
	@PostMapping("/getmydetails")
	List<Patient> getMyDeatils(@RequestBody PatientDTO pd){
		return this.ps.getMyDeatils(pd.getPatientId());
		
	}
	
	@PatchMapping("/updateblood")
	void updateBlood(@RequestBody PatientDTO pd) {
		this.ps.setBloodGroup(pd.getPatientId(), pd.getBloodGroup(),pd.getMedicalHistory(),pd.getHabits());
	}
	@PostMapping("/bookappointment")
	void bookAppointment(@RequestBody AppointmentDTO ad) {
		this.ps.bookAppointment(ad);
	}
	@PostMapping("/getpreviouspres")
	List<Object[]> getPreviousPres(@RequestBody PrescriptionDTO pd){
		return this.ps.getPreviousPres(pd.getPatientId());
	}
}
