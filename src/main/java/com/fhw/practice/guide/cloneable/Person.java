package com.fhw.practice.guide.cloneable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-21 11:09
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Cloneable {
    private Address address;
    @Override
    public Person clone() {
        try {
            Person person = (Person) super.clone();
            person.setAddress(person.getAddress().clone());
            return person;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
