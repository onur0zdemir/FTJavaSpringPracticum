package com.onurozdemir.FTJavaSpringPracticum;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class FtJavaSpringPracticumApplication implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(FtJavaSpringPracticumApplication.class, args);
    }

    @Override
    public void run(String... args) {
    }
}
