package com.nec.DTO;

public class DoctorDTO {

    private Long doctorId;
    private String doctorName;
    private String qualification;
    private String specialization;
    private String timings;
    private Integer experience;
    private String email;
    private String password;

    // ✅ Constructors
    public DoctorDTO() {}

    public DoctorDTO(Long doctorId, String doctorName, String qualification,
                     String specialization, String timings,
                     Integer experience, String email, String password) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.qualification = qualification;
        this.specialization = specialization;
        this.timings = timings;
        this.experience = experience;
        this.email = email;
        this.password = password;
    }

    // ✅ Getters and Setters
    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTimings() {
        return timings;
    }

    public void setTimings(String timings) {
        this.timings = timings;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
