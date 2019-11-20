package com.datang.cn.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.datang.cn.dao.mapper.ProviderMapper;
import com.datang.cn.model.User.Provider;
import com.datang.cn.model.User.ProviderExample;
import com.datang.cn.service.ProviderService;
@Service
public class ProviderServiceImpl implements ProviderService{
	@Resource
	ProviderMapper providerMapper;
	@Resource
	ProviderService providerService;
	@Override
	public Provider selectByPrimaryKey(String id) {
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		criteria.andIdEqualTo(id);		
		return providerMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Provider> login(String cellphone) {
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		criteria.andCellphoneEqualTo(cellphone);
		return providerMapper.selectByExample(providerExample);
	}

	@Override
	public int insert(Provider record) {
	

		return providerMapper.insert(record);
	}

	@Override
	public int findpassword(Provider provider) {
		// TODO Auto-generated method stub
		ProviderExample providerExample=new ProviderExample();
		return providerMapper.updateByExample(provider, providerExample);
	}

	@Override
	public List<Provider> getProviderMessage(String providerid) {
		ProviderExample providerExample = new ProviderExample();
		ProviderExample.Criteria criteria = providerExample.createCriteria();
		criteria.andIdEqualTo(providerid);
		return providerMapper.selectByExample(providerExample);
	}

	@Override
	public List<Provider> getProviderStore(String providerid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveUserImg(Provider provider) {
		// TODO Auto-generated method stub
		
	}


}
