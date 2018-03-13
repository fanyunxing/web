package com.fanyunxing.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Properties;

/**
 * @author: lyh
 * @date: 2018/3/12
 * @description:
 */
@RestController
public class Myspring {

    @GetMapping("/test")
    public String test(){
       return "hello world";
    }
}