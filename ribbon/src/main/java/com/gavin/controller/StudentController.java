package com.gavin.controller;

import com.gavin.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/

@RequestMapping("/ribbon")
@RestController
public class StudentController {


    private final String ROOT_URL_PATH = "http://provider/student/";


    @Value("${server.port}")
    private String port;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject(ROOT_URL_PATH + "index", String.class);
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForObject(ROOT_URL_PATH + "findAll", Collection.class);
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return restTemplate.getForObject(ROOT_URL_PATH + "findById/{id}", Student.class , id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        restTemplate.postForObject(ROOT_URL_PATH + "save", student, Student.class);
    }

    @PutMapping("update")
    public void update(@RequestBody Student student){
        restTemplate.put(ROOT_URL_PATH + "update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        restTemplate.delete(ROOT_URL_PATH + "delete/{id}" , id);
    }

}
