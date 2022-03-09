package com.fhw.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;


/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:06
 */

@SpringBootApplication
@ServletComponentScan({"com.fhw.practice.filter"})
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }
}
