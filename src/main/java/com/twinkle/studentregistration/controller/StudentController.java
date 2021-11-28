/**
 * 
 */
package com.twinkle.studentregistration.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.twinkle.studentregistration.model.Student;
import com.twinkle.studentregistration.service.StudentService;

import io.swagger.annotations.Api;

/**
 * @author Obulareddy
 *
 */
@RestController
@Api(value="Student Registration", description="Student Registration API")
public class StudentController {

	@Autowired
	StudentService studentService;

	/*************** Insert Student Data ***********************/
	@PostMapping("/students")
	public Student createStudent(@Valid @RequestBody Student student) {
		return studentService.createStudent(student);
	}

	/*************** Get Particular Student Data by id ***********/
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable @Min(1) long id) {
		return studentService.getStudent(id);
	}

	/*************** Retrive All Student Data ********************/
	@GetMapping("/students")
	private List<Student> getAllStudents() {
		return studentService.getAllStudent();
	}

	/*************** Update Student Data *************************/
	@PutMapping("/students/{id}")
	private void updateStudent(@PathVariable long id, @RequestBody Student student) {
		studentService.updateStudent(id, student);
	}

	/*************** Delete Particular Student Data by id ***********/
	@DeleteMapping("/students/{id}")
	public void deleteStudent(@PathVariable long id) {
		studentService.deleteStudent(id);
	}
}
