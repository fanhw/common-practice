package com.fhw.practice.spi;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-05 21:47
 */


public interface Search {
    List<String> searchDoc(String keyword);
}
