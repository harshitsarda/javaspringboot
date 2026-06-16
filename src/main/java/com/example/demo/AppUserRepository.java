package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, String> {

    // Automatically translates to: SELECT * FROM app_users WHERE roles = ?
    List<AppUser> findByRoles(String roles);
}
