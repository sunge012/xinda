package com.datang.cn.dao.mapper;

import com.datang.cn.model.User.PrUser;
import com.datang.cn.model.User.PrUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrUserMapper {
    long countByExample(PrUserExample example);

    int deleteByExample(PrUserExample example);

    int insert(PrUser record);

    int insertSelective(PrUser record);

    List<PrUser> selectByExample(PrUserExample example);

    int updateByExampleSelective(@Param("record") PrUser record, @Param("example") PrUserExample example);

    int updateByExample(@Param("record") PrUser record, @Param("example") PrUserExample example);
}