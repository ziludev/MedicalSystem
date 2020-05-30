package com.secondgroup.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.secondgroup.bean.Medicine;
import com.secondgroup.bean.MedicineExample;
import com.secondgroup.dao.MedicineMapper;
import com.secondgroup.service.MedicineService;
import com.secondgroup.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * @author: alex
 * @date: 2020/5/29 6:13 下午
 */

@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Override
    public PageInfo<Medicine> search(String name, Integer type, Integer pageNum) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        if (name != null && name.trim().equals("")) {
            criteria.andNameLike("%"+name+"%");
        }
        if (type != null && type != 0) {
            criteria.andTypeEqualTo(type);
        }

        // 在查询列表前设置查询的pageNum【显示第几页】和pageSize【一共几页】
        PageHelper.startPage(pageNum, PageUtils.PAGE_SIZE);
        List<Medicine> medicineList = medicineMapper.selectByExample(medicineExample);
        // 在查询列表之后，将结果利用PageInfo构造器封装
        PageInfo<Medicine> pageInfo = new PageInfo<Medicine>(medicineList);
        return pageInfo;
    }

    @Override
    public void insert(Medicine medicine) {
        String uuid = UUID.randomUUID().toString().replaceAll("-","");
        medicine.setMid(uuid);
        medicineMapper.insert(medicine);
    }

    @Override
    public void batchDelete(String[] ids) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        criteria.andMidIn(Arrays.asList(ids));
        medicineMapper.deleteByExample(medicineExample);
    }

    @Override
    public Medicine getMedicineDetailById(String id) {
        return medicineMapper.selectByPrimaryKey(id);
    }

    @Override
    public void update(Medicine medicine) {
        medicineMapper.updateByPrimaryKeySelective(medicine);
    }
}
