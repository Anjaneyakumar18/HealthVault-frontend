package com.nec.DTO;

public class PrescriptionDTO {

    private Long prescriptionId;
    private Long patientId;
    private Long doctorId;
    private String note;
    private String prescription; // tablets/injections details

    // Default constructor
    public PrescriptionDTO() {}

    // Parameterized constructor
    public PrescriptionDTO(Long prescriptionId, Long patientId, Long doctorId, String note, String prescription) {
        this.prescriptionId = prescriptionId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.note = note;
        this.prescription = prescription;
    }

    // Getters and Setters
    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
