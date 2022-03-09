package com.fhw.practice.entiy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:18
 */

@TableName("t_student")
@Data
public class Student {
    @TableId(type = IdType.AUTO)
    private Long id;
    @TableField
    private String name;
    @TableField
    private Integer sex;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @TableField(exist = false)
    private Integer flag;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }
}
