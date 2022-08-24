package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student brian = new Student(
			1L, 
			"Brian",
			"brian@gmail.com", 
			LocalDate.of(2000, Month.JANUARY, 1),
			28
			);

            Student david = new Student( 
			"David",
			"david@gmail.com", 
			LocalDate.of(2004, Month.JANUARY, 3),
			27
			);
            
            repository.saveAll(List.of(brian, david));
        
        };

    }
}
