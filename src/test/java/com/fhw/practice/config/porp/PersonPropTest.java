package com.fhw.practice.config.porp;

import com.fhw.practice.MainApplication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-22 19:08
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {MainApplication.class})
public class PersonPropTest {

    @Autowired
    private PersonProp personProp;

    @Test
    @DisplayName("Sakura")
    public void test01() {
        PersonProperties sakura = personProp.getAa();
        System.out.println(sakura);
    }

    @Test
    @DisplayName("Monster")
    public void test02() {
        PersonProperties monster = personProp.getBb();
        System.out.println(monster);
    }

}
