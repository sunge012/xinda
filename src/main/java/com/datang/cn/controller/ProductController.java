package com.datang.cn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.datang.cn.dao.mapper.ProviderProdutMapper;
import com.datang.cn.model.User.BusinessOrder;
import com.datang.cn.model.User.Provider;
import com.datang.cn.model.User.ProviderProdut;
import com.datang.cn.service.OrderService;
import com.datang.cn.service.ProductService;
import com.datang.cn.service.ProviderService;



@Controller
@RequestMapping
public class ProductController {

	@Resource
	ProductService productService;
	@Resource
	OrderService orderService;
	@Resource
	ProviderService providerService;
	@Resource
	ProviderProdutMapper providerProdutMapper;
	
	
	/*
	 * 根据服务商id获取服务商产品
	 */
	@ResponseBody
	@RequestMapping(value = "/providerprodutlistbyid",method = RequestMethod.GET)
	public Map<String,Object> providerProdutListById(HttpServletRequest request, String providerid){
		System.out.println("providerProdutList start");
	
		HttpSession session =  request.getSession();
		session.setAttribute("providerid", providerid);
		System.out.println(providerid);
		Map<String,Object> map = new HashMap<String,Object>();
		List<ProviderProdut> providerProdutList = productService.getProdutListById(providerid);
		map.put("providerProdutList", providerProdutList);
		return map;
	}
	
	
	/*
	 * 根据服务商id获取订单
	 */
	
	
	
	
	
	
	/*
	 * 产品上线下线
	 */
	@ResponseBody
	@RequestMapping(value = "providerprodutchange", method = RequestMethod.GET)
	public Map<String,Object> providerProdutChange(HttpServletRequest request, String id){
		System.out.println("providerprodutchange start");
		Map<String,Object> map = new HashMap<String,Object>();
		List<ProviderProdut> providerProdutChangeList= productService.getProviderProdutChange(id);
		System.out.println("大小：" + providerProdutChangeList.size());
		ProviderProdut providerProdut = new ProviderProdut();
	
		if(providerProdutChangeList.get(0).getStatus() == 1) {
			System.out.println("商品id1：" + providerProdutChangeList.get(0).getId());
			providerProdut.setId(providerProdutChangeList.get(0).getId());
			providerProdut.setStatus(2);
			System.out.println("商品id2：" + providerProdut.getId());
			System.out.println("商品状态： " + providerProdut.getStatus());
			providerProdutMapper.updateByPrimaryKeySelective(providerProdut);
			map.put("mem", "修改状态成功");
			map.put("code", 1);
		}else {
			System.out.println("商品id1：" + providerProdutChangeList.get(0).getId());
			providerProdut.setId(providerProdutChangeList.get(0).getId());
			providerProdut.setStatus(1);
			System.out.println("商品id2：" + providerProdut.getId());
			System.out.println("商品状态： " + providerProdut.getStatus());
		
			providerProdutMapper.updateByPrimaryKeySelective(providerProdut);
			map.put("mem", "修改状态成功");
			map.put("code", 1);
		}
		return map;
	}
	
	
	
	
	@RequestMapping("/serviceProduct")
	
	public String serviceProduct() {

		return "service_product";

	}
	
	@RequestMapping("/serviceExpenses")
	public String serviceExpenses() {

		return "service_expenses";

	}

	@RequestMapping("/serviceStore")
	public String serviceStore() {

		return "service_store";

	}

	/*
	 * @RequestMapping("/serviceSetting")//跳转路径 public String serviceSetting() {
	 * 
	 * return "service_setting";//跳转界面
	 * 
	 * }
	 */
//produt
	@RequestMapping("/selectByName")
	public String selectByExample(Map<String, Object> map, @RequestParam(defaultValue = "0") int pageStart,
			@RequestParam(defaultValue = "3") Integer pageSize, @RequestParam(defaultValue = "") String servicename) {
		List<ProviderProdut> providerprodutList = productService.selectByName(pageStart, pageSize, servicename);
		long count = 0;

		if (servicename.equals("") || servicename == null)
			count = productService.getCount();
		else
			count = productService.getCount(servicename);
		map.put("count", count);
		map.put("providerprodutList", providerprodutList);
		map.put("pageStart", pageStart);
		map.put("pageSize", pageSize);
		map.put("servicename", servicename);
		return "service_product";
	}
	
	//order
		@RequestMapping("/selectName")
		public String selectByName(Map<String, Object> map, @RequestParam(defaultValue = "0") int pageStart,
				@RequestParam(defaultValue = "3") Integer pageSize, @RequestParam(defaultValue = "") String ordername) {
			List<BusinessOrder> businessorderList = orderService.selectByName(pageStart, pageSize, ordername);
			long count = 0;

			if (ordername.equals("") || ordername == null)
				count = orderService.getCount();
			else {
				count = orderService.getCount(ordername);
			}
			map.put("count", count);
			map.put("businessorderList", businessorderList);
			map.put("pageStart", pageStart);
			map.put("pageSize", pageSize);
			map.put("ordername", ordername);
			return "service_orderform";
		}
	
	

	@RequestMapping("/delete")
	public ModelAndView selectByExample(Map<String, Object> map,
			@RequestParam(defaultValue = "0", required = false) Integer id) {
		int i = productService.deleteByPrimaryKey(id);
		if (i == 1)
			return new ModelAndView("redirect:/selectByName");
		else
			return new ModelAndView("error");
	}

	@RequestMapping("/insert")
	public String insert(ProviderProdut providerProdut) {
		int i = productService.insert(providerProdut);
		if (i == 1)
			return "redirect:/selectByName";
		else
			return "error";

	}

	@RequestMapping("/update")
	public String update(ProviderProdut providerProdut) {
		int i = productService.updateByPrimaryKey(providerProdut);
		if (i == 1)
			return "redirect:/selectByName";
		else
			return "error";

	}

	@RequestMapping("/updateQ")
	public String updateQ(Integer id, Model model) throws Exception {

		ProviderProdut providerprodutList = productService.selectByPrimaryKey(id);
		model.addAttribute("providerprodutList", providerprodutList);
		return "service_update";
	}
	@RequestMapping("/serviceSetting")
	public String selectByProvider(@RequestParam(defaultValue = "02") String id,Model model) {
		Provider provider=providerService.selectByPrimaryKey(id);
		model.addAttribute("provider",provider);
		return "service_setting";

	}
	@RequestMapping("/redirect")
	public String jumpPage(HttpServletRequest  request) {
			return request.getParameter("page");
	}


}