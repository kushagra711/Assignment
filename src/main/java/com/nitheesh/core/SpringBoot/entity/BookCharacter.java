package com.nitheesh.core.SpringBoot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class BookCharacter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long characterId;

    private String name;
	
	private String house;
	
	private String role;
	
	private String status;
	
	private String dies;
	
}
