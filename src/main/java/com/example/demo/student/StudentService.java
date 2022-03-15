package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        Student mariam = new Student(
                1L,
                "Mariam",
                "Mariam.jamal@gmail.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                21
        );
        Student freanu = new Student(
                2L,
                "Freanu",
                "freanu.jamal@gmail.com",
                LocalDate.of(1997, Month.AUGUST, 6),
                21
        );
        return List.of(mariam, freanu);
    }

}
