package net.guides.springboot2.springboot2jpacrudexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.aoptest")
public class SpringaopexampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringaopexampleApplication.class, args);
    }
//http://localhost:8080/swagger-ui.html#/
}
