package com.secondgroup.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.*;
import com.secondgroup.dao.DoctorMapper;
import com.secondgroup.dao.RegisterMapper;
import com.secondgroup.service.RegisterService;
import com.secondgroup.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LindaBlack
 * @date 2020/5/29
 */
@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterMapper mapper;

    @Autowired
    private DoctorMapper doctorMapper;

    @Override
    public PageInfo<Register> search(String name, String rid, Integer department, Integer pageNum) {
        RegisterExample example = new RegisterExample();
        RegisterExample.Criteria criteria = example.createCriteria();

        if(name != null && !"".equals(name.trim())){
            criteria.andNameLike("%"+name+"%");
        }
        if(rid != null && !"".equals(rid.trim())){
            criteria.andRidEqualTo(rid);
        }
        if(department != null && department != 0){
            criteria.andDepartmentEqualTo(department);
        }
        PageHelper.startPage(pageNum, PageUtils.PAGE_SIZE);
        List<Register> registers = mapper.selectByExample(example);
        for (Register register :
                registers) {
            Integer did = register.getDid();
            Doctor doctor = doctorMapper.selectByPrimaryKey(did);
            register.setDoctor(doctor);
        }
        return new PageInfo<>(registers);
    }

    @Override
    public Register getRegisterDetailById(String id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Register register) {
        mapper.updateByPrimaryKeySelective(register);
    }

    @Override
    public void batchDelete(String[] idArray) {
        for (String id :
                idArray) {
            mapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void save(Register register) {
        mapper.insert(register);
    }
}
