package com.gavin.reponsitory;

import com.gavin.entity.Student;

import java.util.Collection;


/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/
public interface StudentReponsitory {

    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void deleteById(Long id);

}
