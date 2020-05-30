package com.secondgroup.service;

import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Register;

/**
 * @author LindaBlack
 * @date 2020/5/29
 */
public interface RegisterService {
    PageInfo<Register> search(String name, String rid, Integer department, Integer pageNum);

    Register getRegisterDetailById(String id);

    void update(Register register);

    void batchDelete(String[] idArray);

    void save(Register register);
}
