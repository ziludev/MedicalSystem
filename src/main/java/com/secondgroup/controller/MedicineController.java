package com.secondgroup.controller;

import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Doctor;
import com.secondgroup.bean.Medicine;
import com.secondgroup.service.MedicineService;
import com.secondgroup.utils.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author: alex
 * @date: 2020/5/29 6:14 下午
 */

@Controller
@RequestMapping("/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    // 批量删除
    @RequestMapping(value = "/batchDelete",method = RequestMethod.DELETE)
    @ResponseBody
    public ResultEntity batchDelete(@RequestParam("ids[]") String[] ids) {
        medicineService.batchDelete(ids);
        ResultEntity resultEntity = ResultEntity.success("删除成功");
        return resultEntity;
    }

    // 更新
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String update(Medicine medicine,MultipartFile photo, HttpSession session) throws IOException {
        ServletContext application = session.getServletContext();
        String realPath = application.getRealPath("/img");

        File directory = new File(realPath);
        // 如果不存在
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String originalFilename = UUID.randomUUID().toString().replaceAll("-", "") + photo.getOriginalFilename();
        if (photo.getSize() > 0) {
            photo.transferTo(new File(directory + "/" + originalFilename));
            medicine.setPicture(originalFilename);
        }
        medicineService.update(medicine);
        return "redirect:/medicine/search";
    }

    // 编辑
    @RequestMapping(value = "/edit/{mid}", method = RequestMethod.GET)
    public ModelAndView edit(@PathVariable("mid") String id) {
        Medicine medicine = medicineService.getMedicineDetailById(id);
        ModelAndView modelAndView = new ModelAndView("/medicine/edit");
        modelAndView.addObject("medicine", medicine);
        return modelAndView;
    }

    // 查看详情
    @RequestMapping(value = "/detail/{mid}", method = RequestMethod.GET)
    public ModelAndView detail(@PathVariable("mid") String id) {
        Medicine medicine = medicineService.getMedicineDetailById(id);
        ModelAndView modelAndView = new ModelAndView("/medicine/look");
        modelAndView.addObject("medicine", medicine);
        return modelAndView;
    }

    // 添加
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(Medicine medicine, MultipartFile photo, HttpSession session) throws IOException {
        ServletContext application = session.getServletContext();
        String realPath = application.getRealPath("/img");

        File directory = new File(realPath);
        // 如果不存在
        if (!directory.exists()) {
            directory.mkdirs();
        }
        String originalFilename = UUID.randomUUID().toString().replaceAll("-", "") + photo.getOriginalFilename();
        if (photo.getSize() > 0) {
            photo.transferTo(new File(directory + "/" + originalFilename));
        }

        medicine.setPicture(originalFilename);
        medicineService.insert(medicine);

        return "redirect:/medicine/search";
    }

    // 按条件查询
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public ModelAndView search(String name, Integer type, @RequestParam(value = "pageNum", required = false, defaultValue = "1") Integer pageNum) {
        PageInfo<Medicine> pageInfo = medicineService.search(name, type, pageNum);
        String queryString = parseParam(name, type);
        ModelAndView modelAndView = new ModelAndView("medicine/index");
        modelAndView.addObject("page", pageInfo);
        modelAndView.addObject("queryString", queryString);
        modelAndView.addObject("name", name);
        modelAndView.addObject("type", type);
        return modelAndView;
    }

    private String parseParam(String name, Integer type) {
        StringBuilder stringBuilder = new StringBuilder();
        if (name != null && !name.trim().equals("")) {
            stringBuilder.append("&name=").append(name);
        }
        if (type != null && type != 0) {
            stringBuilder.append("&type=").append(type);
        }
        return stringBuilder.toString();
    }
}
