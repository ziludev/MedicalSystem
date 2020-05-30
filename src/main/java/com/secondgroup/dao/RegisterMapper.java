package com.secondgroup.dao;

import com.secondgroup.bean.Register;
import com.secondgroup.bean.RegisterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterMapper {
    long countByExample(RegisterExample example);

    int deleteByExample(RegisterExample example);

    int deleteByPrimaryKey(String rid);

    int insert(Register record);

    int insertSelective(Register record);

    List<Register> selectByExample(RegisterExample example);

    Register selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByExample(@Param("record") Register record, @Param("example") RegisterExample example);

    int updateByPrimaryKeySelective(Register record);

    int updateByPrimaryKey(Register record);
}