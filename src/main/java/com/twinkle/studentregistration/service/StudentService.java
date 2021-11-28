/**
 * 
 */
package com.twinkle.studentregistration.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.twinkle.studentregistration.dao.StudentDao;
import com.twinkle.studentregistration.model.Student;

/**
 * @author Obulareddy
 *
 */

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public Student createStudent(Student student) {
		return studentDao.save(student);
	}

	public Student getStudent(long id) {
		return studentDao.findById(id).get();
	}

	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<Student>();
		studentDao.findAll().forEach(student -> students.add(student));
		return students;
	}

	public void updateStudent(long id, Student student) {
		studentDao.save(student);
	}

	public void deleteStudent(long id) {
		studentDao.deleteById(id);
	}

}
