package com.secondgroup.controller;

import com.secondgroup.bean.User;
import com.secondgroup.service.UserService;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: alex
 * @date: 2020/5/28 10:00 上午
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 退出
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session) {
        // 将session清空
        session.invalidate();
        return "redirect:/login.jsp";
    }

    /**
     * RedirectAttributes类型的参数在页面重定向的时候，可以向页面传递数据，但不能直接到达页面，需要经过springMVC的映射
     *
     * */
    // 登录
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(User user, HttpSession session, RedirectAttributes attributes) {
        User user1 = userService.login(user);
        if (user1 == null) {
            // Javaweb
            attributes.addFlashAttribute("errorMessage","用户名或密码不正确");
            return "redirect:/login";
        }else {
            session.setAttribute("loginUser",user1);
            return "redirect:/index.jsp";
        }
    }

    // 注册
    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public String regist(User user) {
        boolean result = userService.regist(user);
        if (result) {
            return "redirect:/login.jsp";
        } else {
            return "redirect:/regist.jsp";
        }
    }

    // 验证邮箱是否唯一
    @RequestMapping(value = "/checkEmail", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> checkEmail(@RequestParam("email") String email) {
        User user = userService.checkEmail(email);
        Map<String, Object> map = new HashMap<String, Object>();
        // 如果有该用户信息，不能注册
        if (user != null) {
            map.put("statusCode", 600);
            map.put("message", "该邮箱已经被使用");
        } else {
            // 如果没有 可以注册
            map.put("statusCode", 200);
            map.put("message", "该邮箱可以使用");
        }
        return map;
    }

    // 验证用户名是否唯一
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> getUserInfoByUsername(@RequestParam("username") String username) {
        User user = userService.getUserInfoByUsername(username);
        Map<String, Object> map = new HashMap<String, Object>();
        // 如果有该用户信息，不能注册
        if (user != null) {
            map.put("statusCode", 600);
            map.put("message", "该用户名已经被注册");
        } else {
            // 如果没有 可以注册
            map.put("statusCode", 200);
            map.put("message", "该用户名可以被注册");
        }
        return map;
    }
}
