package com.nec.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nec.DTO.DoctorDTO;
import com.nec.DTO.LabDTO;
import com.nec.DTO.PrescriptionDTO;
import com.nec.Entity.Appointment;
import com.nec.Entity.Docter;
import com.nec.Entity.Lab;
import com.nec.Entity.Prescriptions;
import com.nec.Repository.AppointmentRepository;
import com.nec.Repository.DoctorRepository;
import com.nec.Repository.LabRepository;
import com.nec.Repository.PrescriptionRepository;

import jakarta.transaction.Transactional;

@Service
public class DoctorService {

	DoctorRepository dr;
	PrescriptionRepository pr;
	AppointmentRepository ar;
	LabRepository lr;
	public DoctorService(LabRepository lr,AppointmentRepository ar,DoctorRepository dr,PrescriptionRepository pr) {
		this.dr=dr;
		this.pr=pr;
		this.ar=ar;
		this.lr=lr;
	}
	public List<Docter> getAllDoctors(){
		return this.dr.findAll();
	}
	public List<Docter> getDoctorSuggessions(String doctorName) {
		// TODO Auto-generated method stub
		return this.dr.getDocterSuggessions(doctorName);
	}
	public boolean writePrescription(PrescriptionDTO pd) {
		// TODO Auto-generated method 
		Prescriptions p=new Prescriptions();
		p.setDoctorId(pd.getDoctorId());
		p.setPatientId(pd.getPatientId());
		p.setNote(pd.getNote());
		p.setPrescription(pd.getPrescription());
		this.pr.save(p);
		return true;
	}
	public List<Object[]> getTodayAppointments(Long doctorId) {
		// TODO Auto-generated method stub
		return this.ar.findTodayAppointments(doctorId);
	}
	public void addNewDoctor(DoctorDTO dd) {
		// TODO Auto-generated method stub
		Docter d=new Docter();
		d.setDoctorName(dd.getDoctorName());
		d.setEmail(dd.getEmail());
		d.setExperience(dd.getExperience());
		d.setPassword(dd.getPassword());
		d.setQualification(dd.getQualification());
		d.setSpecialization(dd.getSpecialization());
		d.setTimings(dd.getTimings());
		this.dr.save(d);
		
		
	}
	@Transactional
	
	public void deleteDoctor(Long doctorId) {
		// TODO Auto-generated method stub
		this.dr.deleteAllByDoctorId(doctorId);
		
	}
	public void insertLab(LabDTO ld) {
		// TODO Auto-generated method stub
		Lab l=new Lab();
		l.setCost(ld.getCost());
		l.setDoctorId(ld.getDoctorId());
		l.setPatientId(ld.getPatientId());
		l.setResults(ld.getResults());
		
		this.lr.save(l);
		
		
	}
}
