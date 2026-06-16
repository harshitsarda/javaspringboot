package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "app_users")
@Data
public class AppUser {
    @Id
    @Column(name = "users")
    private String users;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "roles")
    private String roles;
}
