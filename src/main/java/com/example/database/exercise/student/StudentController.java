package com.example.database.exercise.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    @GetMapping
    public List<Student> getStudents() {
        // In a real application, you would fetch the data from a database
        // For simplicity, a hardcoded student is returned here
        return Collections.singletonList(
                new Student(
                        1L,
                        "Ali",
                        "seyedalirafazi80@gmail.com",
                        LocalDate.of(2001, Month.SEPTEMBER, 15),
                        "22"
                )
        );
    }
}
