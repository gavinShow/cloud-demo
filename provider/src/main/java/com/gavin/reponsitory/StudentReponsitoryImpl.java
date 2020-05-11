package com.gavin.reponsitory;

import com.gavin.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/

@Repository
public class StudentReponsitoryImpl implements StudentReponsitory {

    private Map<Long, Student> studentMap;

    public StudentReponsitoryImpl() {
        studentMap = new HashMap<>();
        studentMap.put(1L,new Student(1L,"张三",'男'));
        studentMap.put(2L,new Student(2L,"李四",'女'));
        studentMap.put(3L,new Student(3L,"王五",'男'));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
