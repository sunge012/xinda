package com.datang.cn.controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.datang.cn.model.User.Provider;
import com.datang.cn.model.User.Region;
import com.datang.cn.model.User.RegionExample;
import com.datang.cn.model.User.Provider;
import com.datang.cn.service.ProviderService;


import com.datang.cn.service.ProviderService;


@Controller
@RequestMapping
public class ProviderController {
	
	@Resource
	ProviderService providerService;

	
	@ResponseBody
	@RequestMapping(value = "/servicelogin", method = RequestMethod.POST)
	public Map<String, Object> login(HttpServletRequest request) {
		HttpSession session=request.getSession();
		String code=(String) session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
	
		

		int code1=0;
		String cellphone=request.getParameter("cellphone");
		Map<String,Object> map = new HashMap<String,Object>();
		if(imgcode.toUpperCase().equals(code)) {
			List<Provider> loginList = providerService.login(cellphone);
			if(loginList!=null&&loginList.size()>0) {
				Provider password=loginList.get(0);
				if(password.getPassword().equals(request.getParameter("password"))) {
					code1=1;
					map.put("code", code1);
					map.put("providerId", loginList.get(0).getId());
					System.out.println(loginList.get(0).getId());
					
				}else {
					map.put("code", code1);
				}
			}else {
				map.put("code", code1);
			}
		}
		return map;

	}

	@ResponseBody
	@RequestMapping(value = "/serviceregister", method = RequestMethod.POST)
	public Map<String, Object> register(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
		String id = request.getParameter("id");
		String cellphone = request.getParameter("cellphone");
		String password = request.getParameter("password");
		int code1 = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		if (imgcode.toUpperCase().equals(code)) {
			Provider provider = new Provider();
			provider.setId(id);
			provider.setCellphone(cellphone);
			provider.setPassword(password);
			providerService.insert(provider);
			code1 = 1;
			map.put("code", code1);
		} 
		else {
			map.put("code", code1);
		}
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/servicefindpassword", method = RequestMethod.POST)
	public Map<String, Object> findpassword(HttpServletRequest request) {
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String imgcode = request.getParameter("imgcode");
		String cellphone = request.getParameter("cellphone");
		int code1 = 0;
		Map<String, Object> map = new HashMap<String, Object>();
		if (imgcode.toUpperCase().equals(code)) {
			List<Provider> loginList = providerService.login(cellphone);
			if (loginList != null && loginList.size() > 0) {
				Provider password = loginList.get(0);
				Provider provider = new Provider();
				provider.setId(password.getId());
				provider.setCellphone(password.getCellphone());
				provider.setPassword(request.getParameter("password"));
				if (request.getParameter("password").equals(request.getParameter("password1"))) {
					providerService.findpassword(provider);
					code1 = 1;
					map.put("code", code1);
				} else {
					map.put("code", code1);
				}
			} else {
				map.put("code", code1);
			}
		}
		return map;
	}

	/*
	 * 店铺信息
	 */
	@RequestMapping(value="/providerstore",method=RequestMethod.GET)
	public Map<String, Object> providerStore(String providerid){
		System.out.println("providerStore start");
		Map<String,Object> map=new HashMap<String,Object>();
		List<Provider> list = providerService.getProviderStore( providerid);
		map.put("providerStore", list);
		return map;
		
	}
	
	



}
