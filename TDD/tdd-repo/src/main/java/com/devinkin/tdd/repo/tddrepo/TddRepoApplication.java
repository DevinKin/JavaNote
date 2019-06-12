package com.devinkin.tdd.repo.tddrepo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.devinkin.tdd.repo.tddrepo.user"})
public class TddRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddRepoApplication.class, args);
    }

}
