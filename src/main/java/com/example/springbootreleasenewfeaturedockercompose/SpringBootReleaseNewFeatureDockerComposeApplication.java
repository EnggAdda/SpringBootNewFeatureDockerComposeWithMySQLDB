package com.example.springbootreleasenewfeaturedockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootReleaseNewFeatureDockerComposeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReleaseNewFeatureDockerComposeApplication.class, args);
    }

}
