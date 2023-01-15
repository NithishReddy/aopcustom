package com.example.aopcustom.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.aopcustom.aop.LogAnnotation;

@RestController
@RequestMapping("/v1")
public class Test {
    @RequestMapping(path= "/test", method= RequestMethod.GET)
    @LogAnnotation
    public String getHello(){
        return "Hello";
    }
}
