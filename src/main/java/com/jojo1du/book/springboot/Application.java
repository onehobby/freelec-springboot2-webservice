package com.jojo1du.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableJpaAuditing // JPA Auditing 활성화, test 시 충돌로 인해 JpaConfig클래스로 분리
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
