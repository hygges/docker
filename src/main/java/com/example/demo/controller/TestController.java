package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @BelongsProject: demo
 * @BelongsPackage: com.example.demo.controller
 * @Author: hygge
 * @CreateTime: 2023-07-30  15:16
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/docker")
    public String docker() {
        return "hello docker";
    }
}
