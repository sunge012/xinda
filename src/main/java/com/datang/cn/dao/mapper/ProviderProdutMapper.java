package com.datang.cn.dao.mapper;

import com.datang.cn.model.User.ProviderProdut;
import com.datang.cn.model.User.ProviderProdutExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProviderProdutMapper {
    int insert(ProviderProdut record);

    int insertSelective(ProviderProdut record);

    int deleteByExample(ProviderProdutExample example);

    int deleteByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProviderProdut record, @Param("example") ProviderProdutExample example);

    int updateByExampleWithBLOBs(@Param("record") ProviderProdut record, @Param("example") ProviderProdutExample example);

    int updateByExample(@Param("record") ProviderProdut record, @Param("example") ProviderProdutExample example);

    int updateByPrimaryKeySelective(ProviderProdut record);

    int updateByPrimaryKeyWithBLOBs(ProviderProdut record);
    
    int updateByPrimaryKey(ProviderProdut record);

    List<ProviderProdut> selectByExampleWithBLOBs(ProviderProdutExample example);

    List<ProviderProdut> selectByExample(ProviderProdutExample example);

    ProviderProdut selectByPrimaryKey(Integer id);

	List<ProviderProdut> selectByName(int pageStart, int pageSize,String servicename);

	List<ProviderProdut> selectByName(ProviderProdutExample providerProdutExample);
	
	long countByExample(ProviderProdutExample example);
	
	int getCount(@Param("servicename") String servicename);
}