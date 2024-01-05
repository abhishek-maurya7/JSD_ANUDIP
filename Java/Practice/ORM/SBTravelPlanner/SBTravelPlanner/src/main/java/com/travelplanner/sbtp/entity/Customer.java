package com.travelplanner.sbtp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CustomerInfo")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	
	@Column(length = 25, nullable = false)
	private String cName;
	
	@Column(length = 35)
	private String cSurname;
	
	@Column(length = 40, nullable = false, unique = true)
	@NotBlank(message = "Customer email is mandatory to fill")
	@Email(message = "Customer email is not proper according to norms")
	private String cEmail;
	
	@Column(length = 12, nullable = false, unique = true)
	@NotBlank(message = "Customer number is mandatory")
	private long cPhone;
	
	@Column(length = 40)
	private String addr;
}
