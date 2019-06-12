package com.devinkin.tdd.domain.tdddomain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class TddDomainApplication {

    public static void main(String[] args) {
        SpringApplication.run(TddDomainApplication.class, args);
    }

}
