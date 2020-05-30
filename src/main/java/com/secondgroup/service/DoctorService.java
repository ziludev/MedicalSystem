package com.secondgroup.service;

import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Doctor;

import java.util.List;

/**
 * @author: alex
 * @date: 2020/5/29 12:52 上午
 */

public interface DoctorService {
    List<Doctor> getDoctorList();

    void save(Doctor doctor);

    void update(Doctor doctor);

    Doctor getDoctorDetailById(Integer id);

//    PageInfo<Doctor> getDoctorPage(Integer pageNum);

    PageInfo<Doctor> search(String name, Integer department, Integer pageNum);

    void batchDelete(Integer[] ids);
}
