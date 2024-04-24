package com.fusionbazaar.backend.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator extends User {

    private String adminSpecificField; // replace with actual field

    // getters and setters
}