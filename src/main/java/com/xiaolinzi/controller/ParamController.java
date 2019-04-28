package com.xiaolinzi.controller;

import com.xiaolinzi.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping("/testParam")
    public String testParam(String username,String password){
        System.out.println("执行了……");
        System.out.println("用户名："+username);
        System.out.println("密  码："+password);
        return "success";
    }

    /**
     * 请求参数封装在Javabean的类中
     * @return
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了……");
        System.out.println(account.toString());
        return "success";
    }

    @RequestMapping("/testServerlet")
    public String testServerlet(HttpServletRequest request, HttpServletResponse response){
        System.out.println("执行……");
        System.out.println(request);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

}
