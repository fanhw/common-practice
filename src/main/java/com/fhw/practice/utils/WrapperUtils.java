package com.fhw.practice.utils;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:30
 */


public class WrapperUtils {
    public static <T> LambdaQueryWrapper<T> getQueryWrapper() {
        LambdaQueryWrapper<T> tLambdaQueryWrapper = new LambdaQueryWrapper<>();
        return tLambdaQueryWrapper;
    }

    public static <T> LambdaUpdateWrapper<T> getUpdateWrapper() {
        LambdaUpdateWrapper<T> tLambdaUpdateWrapper = new LambdaUpdateWrapper<>();
        return tLambdaUpdateWrapper;
    }
}
