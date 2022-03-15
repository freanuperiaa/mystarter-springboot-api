package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    "Mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student freanu = new Student(
                    "Freanu",
                    "freanu.jamal@gmail.com",
                    LocalDate.of(1997, Month.AUGUST, 6)
            );

            repository.saveAll(
                    List.of(mariam, freanu)
            );
        };
    }

}
