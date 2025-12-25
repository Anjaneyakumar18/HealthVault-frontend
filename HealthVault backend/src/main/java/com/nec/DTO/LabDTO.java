package com.nec.DTO;

public class LabDTO {

    private Long id;
    private Long patientId;
    private Long doctorId;
    private Double cost;
    private String results;

    // Constructors
    public LabDTO() {
    }

    public LabDTO(Long id, Long patientId, Long doctorId, Double cost, String results) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.cost = cost;
        this.results = results;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }
}
