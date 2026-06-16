package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private TestRecordRepository repository;

	@Autowired
	private AppUserRepository appUserRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--- DB Connection Test ---");
		
		try {
			// Save a record in test_record
			TestRecord record = new TestRecord();
			record.setName("Oracle Free Connection Success!");
			repository.save(record);
			
			// Query and display test_records
			repository.findAll().forEach(r -> {
				System.out.println("Retrieved from Oracle DB (test_record): ID=" + r.getId() + ", Name=" + r.getName());
			});

			System.out.println("\n--- Querying App Users Table ---");
			// Query and display app_users table
			appUserRepository.findAll().forEach(user -> {
				System.out.println("User: " + user.getUsers() + 
				                   " | Created By: " + user.getCreatedBy() + 
				                   " | Role: " + user.getRoles());
			});

			System.out.println("\n--- Custom Query: Finding all DEVELOPERs ---");
			appUserRepository.findByRoles("DEVELOPER").forEach(user -> {
				System.out.println("Developer: " + user.getUsers() + " | Created By: " + user.getCreatedBy());
			});

		} catch (Exception e) {
			System.err.println("Database test failed: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("--------------------------");
	}
}

