package com.example.demo.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    @Column(nullable = false)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Column(nullable = false)
    private String lastName;

    @Min(value = 0, message = "Age must be positive")
    private int age;

    @NotBlank(message = "Gender is required")
    private String gender;

    private String diagnosis;

    private LocalDate admittedDate;

    private LocalDate dischargedDate;

    @Pattern(regexp = "^[0-9+\\-() ]*$", message = "Phone number is invalid")
    private String phone;

    @Email(message = "Email is invalid")
    private String email;

    private String address;
}
