package com.datang.cn.service.impl;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.datang.cn.dao.mapper.ProviderMapper;
import com.datang.cn.dao.mapper.ProviderProdutMapper;
import com.datang.cn.model.User.Provider;
import com.datang.cn.model.User.ProviderProdut;
import com.datang.cn.model.User.ProviderProdutExample;
import com.datang.cn.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Resource
	ProviderProdutMapper providerProdutMapper;
	@Resource
	ProviderMapper providerMapper;

	@Override
	public long getCount() {
		ProviderProdutExample providerProdutExample=new ProviderProdutExample();
		return providerProdutMapper.countByExample(providerProdutExample);
	}

	@Override
	public int getCount(String servicename) {
		return providerProdutMapper.getCount(servicename);
	}

	@Override
	public List<ProviderProdut> selectByName(int pageStart, int pageSize, String servicename) {
		ProviderProdutExample providerProdutExample=new ProviderProdutExample();
		providerProdutExample.setDistinct(true);
		providerProdutExample.setPageStart(pageStart);
		providerProdutExample.setPageSize(pageSize);
		providerProdutExample.setServicename(servicename);
		return providerProdutMapper.selectByName(providerProdutExample);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return providerProdutMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ProviderProdut record) {
		/* record.setId(12); */
		// TODO Auto-generated method stub
		return providerProdutMapper.insert(record);
	}

	@Override
	public int updateByPrimaryKey(ProviderProdut record) {
		// TODO Auto-generated method stub
		return providerProdutMapper.updateByPrimaryKey(record);
	}

	@Override
	public ProviderProdut selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return providerProdutMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<ProviderProdut> getProdutListById(String providerid) {
		System.out.println("查询用户：" + providerid);
		ProviderProdutExample providerProdutExample = new ProviderProdutExample();
		ProviderProdutExample.Criteria criteria=providerProdutExample.createCriteria();
		criteria.andProviderIdEqualTo(providerid);
		return providerProdutMapper.selectByExample(providerProdutExample);
	}

	@Override
	public List<ProviderProdut> getProviderProdutChange(String id) {
		ProviderProdutExample providerProdutExample = new ProviderProdutExample();
		ProviderProdutExample.Criteria criteria=providerProdutExample.createCriteria();
		criteria.andIdEqualTo(id);
		System.out.println("查询商品id：" + id);
		return providerProdutMapper.selectByExample(providerProdutExample);
	}

}
