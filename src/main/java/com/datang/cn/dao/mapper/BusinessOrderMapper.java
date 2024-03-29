package com.datang.cn.dao.mapper;

import com.datang.cn.model.User.BusinessOrder;
import com.datang.cn.model.User.BusinessOrderExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BusinessOrderMapper {
long countByExample(BusinessOrderExample example);
	
	BusinessOrder selectByPrimaryKey(String businessNo);
	
	int getCount(@Param("ordername") String ordername);
	
	List<BusinessOrder> selectByName(int pageStart, int pageSize,String ordername);

	List<BusinessOrder> selectByName(BusinessOrderExample businessOrderExample);

}