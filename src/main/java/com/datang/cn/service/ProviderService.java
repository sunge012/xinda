package com.datang.cn.service;

import java.util.List;

import com.datang.cn.model.User.Provider;

public interface ProviderService {

	Provider selectByPrimaryKey(String id);

	 List<Provider> login(String cellphone);

	int insert(Provider provider);

	int findpassword(Provider provider);

	List<Provider> getProviderMessage(String providerid);

	List<Provider> getProviderStore(String providerid);

	void saveUserImg(Provider provider);

	String getIdByCellPhone(String cellphone);
}
	
