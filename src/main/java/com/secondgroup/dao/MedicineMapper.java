package com.secondgroup.dao;

import com.secondgroup.bean.Medicine;
import com.secondgroup.bean.MedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineMapper {
    long countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int deleteByPrimaryKey(String mid);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExample(MedicineExample example);

    Medicine selectByPrimaryKey(String mid);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}