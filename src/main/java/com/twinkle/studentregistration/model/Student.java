/**
 * 
 */
package com.twinkle.studentregistration.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import lombok.Data;

/**
 * @author Obulareddy
 *
 */

@Entity
@Data
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;

	@NotEmpty(message = "Please Enter name")
	private String name;

	@NotEmpty(message = "Please Enter gender")
	private String gender;

	@NotNull(message = "Please Enter DateofBrith")
	@Past(message = "Please Enter Vaild DateofBrith")
	private LocalDate dateOfBrith;

	@NotEmpty(message = "Please Enter emailId")
	private String emailId;

	@NotEmpty(message = "Please Enter mobileNumber")
	private String mobileNumber;

	@NotEmpty(message = "Please Enter address")
	private String address;
}
