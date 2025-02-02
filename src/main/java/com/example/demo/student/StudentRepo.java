package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo
        extends JpaRepository<Student,Long> {

    //select * from student where email=...

//    @Query("SELECT c FROM student s WHERE s.email=?1")


    Optional<Student> findStudentByEmail(String email);

}
