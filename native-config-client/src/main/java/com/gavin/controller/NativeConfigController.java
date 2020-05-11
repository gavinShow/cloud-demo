package com.gavin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Gavin
 * @Date 2020/5/11
 **/
@RestController
@RequestMapping("/native")
public class NativeConfigController {

    @Value("${server.port}")
    private String port;

    @Value("${foo}")
    private String foo;

    @GetMapping("/index")
    private String index(){
        return this.port + " - " + this.foo;
    }
}
