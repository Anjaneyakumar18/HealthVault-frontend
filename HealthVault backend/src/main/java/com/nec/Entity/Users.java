package com.nec.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")  // matches the MySQL table name
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")   // primary key column
    private Long id;

    @Column(name = "username", nullable = false, length = 30)
    private String username;

    @Column(name = "email", nullable = false, unique = true, length = 40)
    private String email;

    @Column(name = "password", nullable = false, length = 20)
    private String password;
    
    
    @Column(name = "patient_id", nullable = false, length = 20)
    private long patientId;

    public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	// ✅ Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
