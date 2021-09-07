package com.cse682.nursingresourceledgerprototype;

import com.cse682.nursingresourceledgerprototype.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {
        "com.cse682.nursingresourceledgerprototype.repository",
        "com.cse682.nursingresourceledgerprototype.controller",
        "com.cse682.nursingresourceledgerprototype.service"
})
@EnableJpaRepositories(basePackages = "com.cse682.nursingresourceledgerprototype.repository")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class NursingResourceLedgerPrototypeApplication {

    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(NursingResourceLedgerPrototypeApplication.class, args);
    }
}