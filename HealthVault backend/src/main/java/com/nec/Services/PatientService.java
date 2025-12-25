package com.nec.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nec.DTO.AppointmentDTO;
import com.nec.Entity.Appointment;
import com.nec.Entity.Lab;
import com.nec.Entity.Patient;
import com.nec.Entity.Prescriptions;
import com.nec.Repository.AppointmentRepository;
import com.nec.Repository.LabRepository;
import com.nec.Repository.PatientRepository;
import com.nec.Repository.PrescriptionRepository;

@Service
public class PatientService {

	PatientRepository pr;
	LabRepository lr;
	AppointmentRepository ar;
	PrescriptionRepository prr;
	public PatientService(PrescriptionRepository prr,PatientRepository pr,LabRepository lr,AppointmentRepository ar) {
		this.lr=lr;
		this.pr=pr;
		this.ar=ar;
		this.prr=prr;
	}
	public List<Object[]> getPrevCol(Long patientId) {
		// TODO Auto-generated method stub
		return this.pr.getPrevCol(patientId);
	}
	
	public List<Object[]> getPrevLabRecords(Long patientId){
		return this.lr.findLabsByPatientId(patientId);
	}
	public List<Patient> getMyDeatils(Long patientId) {
		// TODO Auto-generated method stub
		return this.pr.findByPatientId(patientId);
	}
	
	public void setBloodGroup(long patientId,String bloodGroup,String medicalHistory,String habits) {
		this.pr.setBloodGroup(patientId, bloodGroup,medicalHistory,habits);
	}
	public void bookAppointment(AppointmentDTO ad) {
		// TODO Auto-generated method stub
		Appointment a=new Appointment();
		a.setDoctorId(ad.getDoctorId());
		a.setPatientId(ad.getPatientId());
		a.setDate(ad.getDate());
		this.ar.save(a);
		
		
		
	}
	public List<Object[]> getPreviousPres(Long patientId) {
		return this.prr.findByPatientId(patientId);
		
//		return this.prr.findByPatientId(patientId);
	}
	
}
