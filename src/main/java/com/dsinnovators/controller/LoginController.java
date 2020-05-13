package com.dsinnovators.controller;

import com.dsinnovators.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class LoginController {

    @Autowired
    private UserDao userDao;

    @PostMapping("/login")
    private String login(Model model, @RequestParam String email, @RequestParam String password){

        if(!isValidEmail(email)){
            model.addAttribute("error","Invalid email address.");
            return "index";
        }

        String password2 = userDao.findUserPasswordByEmail(email);
        if(password.equals(password2))
          return "home";
        model.addAttribute("error","Email or password is wrong!");
        return "index";
    }


    private boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(email);
        return m.matches();
    }

}
