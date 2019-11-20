package com.datang.cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.cn.dao.mapper.BusinessOrderMapper;
import com.datang.cn.model.User.BusinessOrder;
import com.datang.cn.model.User.BusinessOrderExample;
import com.datang.cn.service.OrderService;
@Service
public class OrderServiceImpl implements OrderService{

	
	
	@Resource
	BusinessOrderMapper businessOrderMapper;
	
	@Override
	public BusinessOrder selectByPrimaryKey(String businessNo) {
		// TODO Auto-generated method stub
		return businessOrderMapper.selectByPrimaryKey(businessNo);
	}

	@Override
	public int getCount(String ordername) {
		// TODO Auto-generated method stub
		return businessOrderMapper.getCount(ordername);
	}

	@Override
	public List<BusinessOrder> selectByName(int pageStart, int pageSize, String ordername) {
		
		BusinessOrderExample businessOrderExample=new BusinessOrderExample();
		businessOrderExample.setDistinct(true);
		businessOrderExample.setPageSize(pageSize);
		businessOrderExample.setPageStart(pageStart);
		businessOrderExample.setOrdername(ordername);
		
		
		return businessOrderMapper.selectByName(businessOrderExample);
	}

	@Override
	public long getCount() {
		BusinessOrderExample businessOrderExample=new BusinessOrderExample(); 
		return businessOrderMapper.countByExample(businessOrderExample);
	}

}
