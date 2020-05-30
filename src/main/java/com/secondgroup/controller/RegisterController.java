package com.secondgroup.controller;

import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Doctor;
import com.secondgroup.bean.Medicine;
import com.secondgroup.bean.Register;
import com.secondgroup.service.RegisterService;
import com.secondgroup.utils.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author LindaBlack
 * @date 2020/5/29
 */
@Controller
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    private RegisterService service;

    @RequestMapping(value = "/detail/{rid}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("rid") String id) {
        Register register = service.getRegisterDetailById(id);
        ModelAndView modelAndView = new ModelAndView("/register/look");
        modelAndView.addObject("register", register );
        return modelAndView;

    }

    @RequestMapping(value = "/edit/{rid}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("rid") String id) {
        Register register = service.getRegisterDetailById(id);
        ModelAndView modelAndView = new ModelAndView("/register/edit");
        modelAndView.addObject("register", register );
        return modelAndView;

    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Register register){
        service.save(register);
        return "redirect:/register/search";
    }

    @RequestMapping(value = "batchDelete",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultEntity batchDelete(@RequestParam("idArray[]") String[] idArray){
        service.batchDelete(idArray);
        return ResultEntity.success("删除成功");
    }
    @RequestMapping(value = "/edit1",method = RequestMethod.POST)
    public String update(Register register){
        service.update(register);

        return "redirect:/register/search";
    }


    /**
     * 获取病人列表
     * @return ModelAndView 页面
     */
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public ModelAndView search(String name, String rid, Integer department ,@RequestParam(value = "pageNum",required = false,defaultValue = "1") Integer pageNum ){
        PageInfo<Register> registerPageInfoPage = service.search(name,rid,department, pageNum);
        String queryString = parseParam(name,rid);
        ModelAndView modelAndView = new ModelAndView("/register/index");
        modelAndView.addObject("registerPage",registerPageInfoPage);
        modelAndView.addObject("queryString",queryString);
        modelAndView.addObject("name",name);
        modelAndView.addObject("rid",rid);
        modelAndView.addObject("department",department);
        return modelAndView;
    }

    private String parseParam(String name, String rid) {
        StringBuilder stringBuilder = new StringBuilder();
        if(name != null && !"".equals(name.trim())){
            stringBuilder.append("&name=").append(name);
        }
        if(rid != null && !"".equals(rid.trim())){
            stringBuilder.append("&rid=").append(rid);
        }
        return stringBuilder.toString();
    }


}
