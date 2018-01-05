package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @Autowired
    RedisDao redisDao;

    @RequestMapping("/index1")
    public String index(){
        System.out.println(redisDao.getValue("name"));
        return "hello word spring boot11";
    }

    @RequestMapping("/index2")
    public String index2(){
        System.out.println("index22");
        return "hello word spring boot22";
    }

    @RequestMapping("/index3")
    public String index3(){
        System.out.println("index3344");
        return "hello word spring boot3344";
    }

    @GetMapping("/checkForm")
    public String checkForm(@Valid ValidForm form, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            StringBuilder errorSb = new StringBuilder();
            for (ObjectError error : bindingResult.getAllErrors() ) {
                errorSb.append(error.getDefaultMessage());
                errorSb.append("\r\n");
            }
            return errorSb.toString();
        }

        return "success";
    }
}
