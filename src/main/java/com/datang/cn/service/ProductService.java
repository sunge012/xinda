package com.datang.cn.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import com.datang.cn.model.User.ProviderProdut;

public interface ProductService {

	public long getCount();
	
	int getCount(@Param("servicename") String servicename);
	
	List<ProviderProdut> selectByName(int pageStart, int pageSize,String servicename);
	
	ProviderProdut selectByPrimaryKey(Integer id);
	
	int deleteByPrimaryKey(Integer id);
	
	int insert(ProviderProdut record);
	
	int updateByPrimaryKey(ProviderProdut record);

	List<ProviderProdut> getProdutListById(String providerid);

	 List<ProviderProdut> getProviderProdutChange(String produtid);
	
}
