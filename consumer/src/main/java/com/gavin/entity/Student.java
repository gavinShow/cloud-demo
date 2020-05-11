package com.gavin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long id;
    private String name;
    private char gender;

}
