package com.viviant.houserelease.web.controller;

import com.viviant.houserelease.domain.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created with IntelliJ IDEA.
 * User: viviant
 * Date: 15-4-30
 * Time: 上午11:10
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class LoginController {
    @RequestMapping(value = "login")
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response, LoginForm command) {
        String username = command.getUsername();
        System.out.println("sssssssssssssssss"+username);
        ModelAndView mv = new ModelAndView("/index/index", "command", "LOGIN SUCCESS, " + username);
        return mv;
    }

}
