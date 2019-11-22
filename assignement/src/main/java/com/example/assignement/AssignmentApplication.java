package com.example.assignement;

import Controller.homeController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/* Spring generated main = Runner of program. */
@SpringBootApplication
@ComponentScan(basePackageClasses= homeController.class)
public class AssignmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(AssignmentApplication.class, args);
    }
}
