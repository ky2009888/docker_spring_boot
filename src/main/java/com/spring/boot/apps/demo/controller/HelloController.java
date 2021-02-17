package com.spring.boot.apps.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @Author ky2009666
 * @Description 演示使用docker部署spring boot项目
 * @Date 2021/2/17
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    /**
     * 显示时间
     *
     * @return datetime
     */
    @GetMapping("/date")
    public String showHello() {
        return "现在时间是:" + LocalDateTime.now();
    }
}
