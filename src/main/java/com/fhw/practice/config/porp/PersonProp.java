package com.fhw.practice.config.porp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-22 18:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@ConfigurationProperties(prefix = "role")
public class PersonProp {
    private PersonProperties aa = new PersonProperties();
    private PersonProperties bb = new PersonProperties();
}
