package com.secondgroup.controller;

import com.secondgroup.utils.ValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/code")
public class CodeController {

    // 获取验证码图片
    @RequestMapping(value="/getCode",method = RequestMethod.GET)
    public void getCode(@RequestParam(value = "time") String time, HttpServletRequest request, HttpServletResponse response) {
        ValidateCode code = new ValidateCode(100, 30, 4, 30, 25, "validateCode");
        code.getCode(request, response);
    }

    // 检查验证码
    @RequestMapping(value = "/checkCode",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> checkCode(@RequestParam("code") String code, HttpSession session) {
        String sessionCode = (String) session.getAttribute("validateCode");
        Map<String,Object> map = new HashMap<String, Object>();
        // 检查session的验证码和用户输入的是否一致
        if (sessionCode.equalsIgnoreCase(code)) {
            map.put("statusCode",200);
            map.put("message","验证通过");
        }else {
            map.put("statusCode",600);
            map.put("message","验证码错误");
        }
        session.removeAttribute("validateCode");
        return map;
    }
}
