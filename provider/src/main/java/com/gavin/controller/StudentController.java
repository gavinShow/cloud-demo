package com.gavin.controller;

import com.gavin.entity.Student;
import com.gavin.reponsitory.StudentReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Collection;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/

@RequestMapping("/student")
@RestController
public class StudentController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private StudentReponsitory studentReponsitory;


    @GetMapping("/index")
    public String index(){
        return "当前端口："+ this.port;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentReponsitory.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentReponsitory.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentReponsitory.saveOrUpdate(student);
    }

    @PutMapping("update")
    public void update(@RequestBody Student student){
        studentReponsitory.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentReponsitory.deleteById(id);
    }

}
