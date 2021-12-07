package edu.soft2.controller;

import edu.soft2.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "user")
public class UserController {
    //删除操作
    @RequestMapping(value = "index")
    public String index(){
        System.out.println("----index()----");
        return "forward:/index.jsp";
    }

    //登录
    @RequestMapping(value = "login")
    public String login(User user, HttpSession session){
        System.out.println("----login()----");
        int flag = 1;//调用业务层,获取返回值
        if (flag == 1) {
            session.setAttribute("user",user);
            return "welcome";
        }
        return "hello";
    }

    @RequestMapping("/Logout")
    public String logout(HttpServletRequest request){
        System.out.println("----logout----");
        HttpSession session = request.getSession();
        session.invalidate();
        System.out.println("session失效");
        String msg = "你已退出登录！";
        request.setAttribute("msg",msg);
        return "forward:/index.jsp";
//        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("----hello()----");
        return "hello";
    }

}