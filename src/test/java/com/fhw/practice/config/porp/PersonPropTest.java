package com.fhw.practice.config.porp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fhw.practice.MainApplication;
import com.fhw.practice.model.Fish;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Map;
import java.util.TreeMap;

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

    @Test
    @DisplayName("myTest")
    public void test03() throws JsonProcessingException {
        Fish fish = new Fish().setName("name").setAge(18).setInterest("hhhh");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS,false);
        String string = objectMapper.writeValueAsString(fish);
       // System.out.println(string);
        Map<String,Object> map = objectMapper.readValue(string, Map.class);
        System.out.println(map);
        TreeMap<String, Object> treeMap = new TreeMap<>(String::compareTo);
        treeMap.putAll(map);
        System.out.println(treeMap);
        String string1 = treeMap.toString();
        System.out.println(string1);
        String replaceAll = string1.replaceAll(", ", "&");
        System.out.println(replaceAll.substring(1,replaceAll.length()-1));
    }
}
