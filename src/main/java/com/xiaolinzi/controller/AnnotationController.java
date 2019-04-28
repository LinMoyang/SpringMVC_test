package com.xiaolinzi.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 常用注解
 */
@Controller
@RequestMapping("/anno")
public class AnnotationController {

    @RequestMapping("/testAnnotation")
    public String testAnnotation(){
        System.out.println("执行了……");
        return "success";
    }

    /**
     * PathVariable注解
     * @return
     */
    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable(name="id") String id){
        System.out.println("执行了……");
        System.out.println(id);
        return "success";
    }

    /**
     * ModelAttribute注解
     * @param id
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@PathVariable(name="id") String id){
        System.out.println("testModelAttribute执行了……");
        System.out.println(id);
        return "success";
    }
    @ModelAttribute
    public void shouUser(){
        System.out.println("show方法执行了……");
    }

}
