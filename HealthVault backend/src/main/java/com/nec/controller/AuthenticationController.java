package com.nec.controller;

import org.springframework.web.bind.annotation.*;

import com.nec.DTO.PatientDTO;
import com.nec.Entity.Users;
import com.nec.Services.AuthenticationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class AuthenticationController {
	
	AuthenticationService as;
	public AuthenticationController(AuthenticationService as) {
		this.as=as;
	}
	

    @GetMapping("/try")
    String Trying() {
        return "Nimmakai, this is authentication request mapping working!!";
    }

    @PostMapping("/login")
    public Users patientLogin(@RequestBody PatientDTO pd) {
    	return this.as.patientLogin(pd);
    	
    }

    @PostMapping("/patientregister")
    public boolean PatientRegister(@RequestBody PatientDTO pd) {
    	return this.as.register(pd);
    	
    }
}
