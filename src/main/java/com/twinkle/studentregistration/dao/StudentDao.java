/**
 * 
 */
package com.twinkle.studentregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.twinkle.studentregistration.model.Student;

/**
 * @author Obulareddy
 *
 */
@Repository
public interface  StudentDao extends JpaRepository<Student, Long> {

}
