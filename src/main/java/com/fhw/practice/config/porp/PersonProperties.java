package com.fhw.practice.config.porp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-22 18:54
 */
@Configuration
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ConfigurationProperties(prefix = "our.role")
public class PersonProperties {
    private String name;
    private Integer age;
}
