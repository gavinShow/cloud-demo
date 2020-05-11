package com.gavin.client.error;

import com.gavin.client.FeignProviderClient;
import com.gavin.entity.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/

@Component
public class FeignProviderError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中...";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
