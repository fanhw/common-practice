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
@AllArgsConstructor
@NoArgsConstructor
public class Address implements Cloneable{
    private String name;
    @Override
    public Address clone() {
        try {
            return (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
