package com.gavin.client;

import com.gavin.client.error.FeignProviderError;
import com.gavin.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/

@FeignClient(value = "provider" , fallback = FeignProviderError.class)
public interface FeignProviderClient {

    @GetMapping("/student/index")
    public String index();

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable Long id);

    @PostMapping("/student/save")
    public void save(@RequestBody Student student);

    @PutMapping("/student/update")
    public void update(@RequestBody Student student);

    @DeleteMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable Long id);

}
