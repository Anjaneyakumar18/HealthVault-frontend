# 🏥 Hospital Vault System

Hospital Vault System is a web-based application developed during a **24-hour college-level hackathon** to digitally manage patient medical records such as lab reports, prescriptions, and appointments.  
The project focuses on simplifying hospital workflows by centralizing patient data and enabling seamless collaboration between doctors.

---

## 🧠 Problem Statement

Hospitals often rely on manual or scattered systems to manage:
- Patient lab reports
- Previous prescriptions
- Doctor appointments
- Referrals between doctors

This leads to inefficiency, data loss, and difficulty in tracking patient history.  
**Hospital Vault System** provides a centralized digital solution for storing and accessing patient medical information.

---

## ✨ Features

### 👥 Role-Based System
The application supports four main roles:
- **Patient**
- **Doctor**
- **Lab Staff**
- **Admin**

Each role has access to features relevant to their responsibilities.

---

### 📁 Lab Report Storage
- Lab staff can upload patient lab reports
- Reports are stored as **text (.txt) files**
- Reports are linked to the respective patient profile

---

### 📄 Prescription History
- Doctors can view a patient's **complete previous prescription history**
- Helps in understanding medical background and ongoing treatments

---

### 🔁 Doctor-to-Doctor Case Forwarding
- Doctors can forward a patient case to another doctor
- The forwarded doctor receives **full medical history**
- Access is **permanent**, enabling long-term collaboration

---

### 📅 Appointment Booking
- Patients can book appointments with doctors
- Doctors can view assigned appointments
- Simplifies appointment tracking within the hospital

---

### 👤 Admin Management
- Admin can manage users and roles
- Controls overall system configuration

---

## 🛠️ Tech Stack

### Frontend
- React.js

### Backend
- Spring Boot (REST APIs)

### Database
- MySQL

### API Testing
- Postman

---

## 🔐 Authentication Note

- Basic authentication is implemented
- No advanced security mechanisms were added
- Security was intentionally kept minimal due to **hackathon time constraints**

---

## 🏗️ System Highlights

- Clear separation of frontend and backend
- RESTful API-based communication
- Simple database design to manage patients, reports, and appointments
- Focus on functionality and real-world hospital workflows

---

## 🏆 Hackathon Details

- **Duration:** 24 Hours  
- **Level:** College-Level Hackathon  
- **Organized by:** DataValley (in collaboration with NEC)  
- **Institution:** Narasaraopet Engineering College (NEC)

This project was built and demonstrated within the hackathon timeframe, focusing on practical use cases rather than production-level complexity.

---

## 🚀 Future Enhancements

- JWT-based authentication and authorization
- Secure file storage (PDF/image support)
- Email notifications for appointments and reports
- Audit logs for medical record access
- Search and filter functionality for medical records
- Mobile application support
- Analytics dashboard for doctors and admins

---

## 👨‍💻 Contribution

- Designed system architecture
- Developed backend APIs using Spring Boot
- Integrated frontend with backend APIs
- Designed database schema and relationships
