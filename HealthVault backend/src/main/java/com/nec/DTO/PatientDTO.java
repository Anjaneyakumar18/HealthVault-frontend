package com.nec.DTO;

public class PatientDTO {

    private Long patientId;
    private String patientName;
    private String address;
    private String bloodGroup;
    private String medicalHistory;
    private String habits;
    private Long doctorId;
    private String patientEmail;
    private String password;
    private Long age;
    
    

    public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// ✅ Constructors
    public PatientDTO() {}

    public PatientDTO(Long patientId, String patientName, String address,
                      String bloodGroup, String medicalHistory,
                      String habits, Long doctorId, String patientEmail) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.address = address;
        this.bloodGroup = bloodGroup;
        this.medicalHistory = medicalHistory;
        this.habits = habits;
        this.doctorId = doctorId;
        this.patientEmail = patientEmail;
    }

    // ✅ Getters and Setters
    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getHabits() {
        return habits;
    }

    public void setHabits(String habits) {
        this.habits = habits;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
