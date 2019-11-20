package com.datang.cn.service;

import java.util.List;

import com.datang.cn.model.User.BusinessOrder;

public interface OrderService {

	BusinessOrder selectByPrimaryKey(String businessNo);

	int getCount(String ordername);

	List<BusinessOrder> selectByName(int pageStart, int pageSize, String ordername);

	public long getCount();

}
