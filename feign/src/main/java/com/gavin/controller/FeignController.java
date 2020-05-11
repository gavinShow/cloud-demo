package com.gavin.controller;

import com.gavin.client.FeignProviderClient;
import com.gavin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/
@RequestMapping("/feign")
@RestController
public class FeignController {

    @Autowired
    private FeignProviderClient client;

    @GetMapping("/index")
    public String index(){
        return client.index();
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return client.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable Long id){
        return client.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        client.save(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
        client.update(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        client.deleteById(id);
    }

}
