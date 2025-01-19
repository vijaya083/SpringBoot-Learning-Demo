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
    CommandLineRunner commandLineRunner(StudentRepo repos){

        return args -> {
            Student riya = new Student(

                    "riya",
                    LocalDate.of(2000, Month.JANUARY, 4),
                    "riya.jj@gmail.com"

            );
            Student alex = new Student(

                    "alex",
                    LocalDate.of(2008, Month.JANUARY, 4),
                    "alex.jp@gmail.com"

            );
            repos.saveAll(
                    List.of(riya,alex));
                    System.out.println("saved sucessfully");


        };
    }

}
