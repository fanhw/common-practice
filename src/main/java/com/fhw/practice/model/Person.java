package com.fhw.practice.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-10 10:40
 */

@Data
@Component
@ToString
@Validated
@ConfigurationProperties(prefix = "person")
public class Person {
    @Email
    private String email;
    @Value("${person.name:fhw}")
    private String name;
    private String username;
   // @NotNull
    private Integer age;
    private Map<String, Object> pet;
    private List<String> animal;
    private List<String> interests;
    private List<Object> friends;
    private List<Map<String, Object>> children;
    private Student student;
}
