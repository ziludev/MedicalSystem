package com.secondgroup.service;

import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Medicine;

/**
 * @author: alex
 * @date: 2020/5/29 6:12 下午
 */

public interface MedicineService {
    PageInfo<Medicine> search(String name, Integer type, Integer pageNum);

    void insert(Medicine medicine);

    void batchDelete(String[] ids);

    Medicine getMedicineDetailById(String id);

    void update(Medicine medicine);
}
