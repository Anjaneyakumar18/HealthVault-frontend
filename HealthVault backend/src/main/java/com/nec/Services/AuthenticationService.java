package com.nec.Services;

import org.springframework.stereotype.Service;

import com.nec.DTO.PatientDTO;
import com.nec.Entity.Patient;
import com.nec.Entity.Users;
import com.nec.Repository.AuthenticationRepository;
import com.nec.Repository.PatientRepository;

@Service
public class AuthenticationService {

    private final AuthenticationRepository ar;
    private final PatientRepository pr;

    AuthenticationService(AuthenticationRepository ar,PatientRepository pr){
        this.ar = ar;
        this.pr=pr;
    }

    public Users patientLogin(PatientDTO pd) {
        return ar.findByEmailAndPassword(pd.getPatientEmail(), pd.getPassword());
    }
    public boolean register(PatientDTO pd) {
    	Patient p=new Patient();
    	p.setPatientName(pd.getPatientName());
    	p.setPatientEmail(pd.getPatientEmail());
    	p.setAddress(pd.getAddress());
    	p.setBloodGroup(pd.getBloodGroup());
    	p.setDoctorId(pd.getDoctorId());
    	p.setHabits(pd.getHabits());
    	p.setMedicalHistory(pd.getMedicalHistory());
    	p.setPassword(pd.getPassword());
    	this.pr.save(p);
    	return true;
    }
}
