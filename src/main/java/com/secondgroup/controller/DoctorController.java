package com.secondgroup.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Doctor;
import com.secondgroup.service.DoctorService;
import com.secondgroup.utils.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.print.Doc;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: alex
 * @date: 2020/5/29 12:52 上午
 */

@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // 批量删除
    @RequestMapping(value = "/batchDelete",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultEntity batchDelete(@RequestParam("ids[]") Integer[] ids) {
        doctorService.batchDelete(ids);
        ResultEntity resultEntity = ResultEntity.success("删除成功");
        return resultEntity;
    }

    // 更新
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public String update(Doctor doctor) {
        doctorService.update(doctor);
        return "redirect:/doctor/search";
    }

    // 编辑
    @RequestMapping(value = "/edit/{did}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("did") Integer id) {
        Doctor doctor = doctorService.getDoctorDetailById(id);
        ModelAndView modelAndView = new ModelAndView("/doctor/edit");
        modelAndView.addObject("doctor", doctor);
        return modelAndView;
    }

    // 查看详情
    @RequestMapping(value = "/detail/{did}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("did") Integer id) {
        Doctor doctor = doctorService.getDoctorDetailById(id);
        ModelAndView modelAndView = new ModelAndView("doctor/look");
        modelAndView.addObject("doctor", doctor);
        return modelAndView;
    }

    // 添加医生
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Doctor doctor) {
        doctorService.save(doctor);
        return "redirect:/doctor/search";
    }

    // 带查询条件
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(String name, Integer department, @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum) {
        PageInfo<Doctor> pageInfo = doctorService.search(name, department, pageNum);
        String queryString = parseParam(name, department);
        ModelAndView modelAndView = new ModelAndView("doctor/index");
        modelAndView.addObject("page", pageInfo);
        modelAndView.addObject("queryString",queryString);
        modelAndView.addObject("name",name);
        modelAndView.addObject("department",department);
        return modelAndView;
    }

    private String parseParam(String name, Integer department) {
        StringBuilder stringBuilder = new StringBuilder();
        if (name != null && !name.trim().equals("")) {
            stringBuilder.append("&name=").append(name);
        }
        if (department != null && department != 0) {
            stringBuilder.append("&department=").append(department);
        }
        return stringBuilder.toString();
    }

//    // 查看医生列表
//    @RequestMapping( value = "/list", method = RequestMethod.GET)
//    public ModelAndView getDoctorList(@RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum) {
////        List<Doctor> doctorList = doctorService.getDoctorList();
//        PageInfo<Doctor> pageInfo = doctorService.getDoctorPage(pageNum);
//        ModelAndView modelAndView = new ModelAndView("doctor/index");
//        modelAndView.addObject("page",pageInfo);
//        return modelAndView;
//    }
}
