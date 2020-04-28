package com.demo.TestProjectJava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.demo.*"})
public class TestProjectJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectJavaApplication.class, args);
    }

}
