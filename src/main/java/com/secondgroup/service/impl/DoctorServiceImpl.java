package com.secondgroup.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Doctor;
import com.secondgroup.bean.DoctorExample;
import com.secondgroup.dao.DoctorMapper;
import com.secondgroup.service.DoctorService;
import com.secondgroup.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: alex
 * @date: 2020/5/29 12:52 上午
 */

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public List<Doctor> getDoctorList() {
        DoctorExample doctorExample = new DoctorExample();
        return doctorMapper.selectByExample(doctorExample);
    }

    @Override
    public void save(Doctor doctor) {
        doctorMapper.insert(doctor);
    }

    @Override
    public void update(Doctor doctor) {
        doctorMapper.updateByPrimaryKeySelective(doctor);
    }

    @Override
    public Doctor getDoctorDetailById(Integer id) {
        return doctorMapper.selectByPrimaryKey(id);
    }

//    @Override
//    public PageInfo<Doctor> getDoctorPage(Integer pageNum) {
//        DoctorExample doctorExample = new DoctorExample();
//        // 在查询列表前设置查询的pageNum【显示第几页】和pageSize【一共几页】
//        PageHelper.startPage(pageNum, PageUtils.PAGE_SIZE);
//        List<Doctor> doctorList = doctorMapper.selectByExample(doctorExample);
//        // 在查询列表之后，将结果利用PageInfo构造器封装
//        PageInfo<Doctor> pageInfo = new PageInfo<Doctor>(doctorList);
//        return pageInfo;
//    }

    @Override
    public PageInfo<Doctor> search(String name, Integer department, Integer pageNum) {
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();

        if (name != null && name.trim().equals("")) {
            criteria.andNameLike("%" + name + "%");
        }
        if (department != null && department != 0) {
            criteria.andDepartmentEqualTo(department);
        }

        // 在查询列表前设置查询的pageNum【显示第几页】和pageSize【一共几页】
        PageHelper.startPage(pageNum, PageUtils.PAGE_SIZE);
        List<Doctor> doctorList = doctorMapper.selectByExample(doctorExample);
        // 在查询列表之后，将结果利用PageInfo构造器封装
        PageInfo<Doctor> pageInfo = new PageInfo<Doctor>(doctorList);
        return pageInfo;
    }

    @Override
    public void batchDelete(Integer[] ids) {
//        for (Integer id : ids) {
//            doctorMapper.deleteByPrimaryKey(id)
//        }
        DoctorExample doctorExample = new DoctorExample();
        DoctorExample.Criteria criteria = doctorExample.createCriteria();
        criteria.andDidIn(Arrays.asList(ids));
        doctorMapper.deleteByExample(doctorExample);
    }
}
