package com.example.database.exercise;

import com.example.database.exercise.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryInterface extends JpaRepository<Student, Long> {
}
