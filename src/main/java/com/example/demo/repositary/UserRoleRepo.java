package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UserRole;

@Repository
public interface UserRoleRepo extends JpaRepository<UserRole, Long>{

}
