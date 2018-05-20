package com.accountant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.accountant")
@EntityScan("com.accountant")
@ComponentScan("com.accountant")
public class AccountantMainClass {
    public static void main(String[] args) {
        SpringApplication.run(AccountantMainClass.class, args);
    }
}
