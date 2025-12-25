package com.nec.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;

    @Column(name = "patient_name", nullable = false, length = 30)
    private String patientName;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "blood_group", length = 4)
    private String bloodGroup;

    @Column(name = "medical_history", length = 1000)
    private String medicalHistory;

    @Column(name = "habits", length = 400)
    private String habits;

    @Column(name = "doctor_id")
    private Long doctorId;

    @Column(name = "password", nullable = false, length = 255)
    private String password;

    @Column(name = "patient_email", nullable = false, unique = true, length = 40)
    private String patientEmail;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }
}
