package com.nec.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nec.Entity.Users;

@Repository
public interface AuthenticationRepository extends JpaRepository<Users, Long> {
    Users findByEmailAndPassword(String email, String password);
}

