package com.takeaway.core.schedule;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.time.FastDateFormat;
import org.apache.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSONObject;
import com.takeaway.commons.utils.DateUtil;
import com.takeaway.modular.dao.model.OrderHistorys;
import com.takeaway.modular.dao.model.Orders;
import com.takeaway.modular.service.OrderHistorysService;
import com.takeaway.modular.service.OrdersService;
@Component
public class InvalidOrdersJobs {
	Logger log = Logger.getLogger(InvalidOrdersJobs.class);
	@Autowired
	private OrderHistorysService orderHistorysService;
	@Autowired
	private OrdersService ordersService;
	
	//超时未支付
	@Scheduled(cron = "0 0/30 * * * ?")
	public void cronJob() {
		  List<Orders> orders=ordersService.getAllByNotPay();
		  for(Orders order:orders){
			  long cha = new Date().getTime()-order.getCreatedAt().getTime();
		        double result = cha * 1.0 / (1000 * 60 * 60); 
		        if(result>=0.5){ 
		        	order.setStatus(8);	//	1 待支付。2 待发货。  3 待收货 4 待评价  5 已完成  6退款/售后 7 已退款 8 超时未支付作废
		        	order.setUpdatedAt(new Date());
		        	ordersService.update(order);
		        	
		        	OrderHistorys orderHistorys=new OrderHistorys();
		        	BeanUtils.copyProperties(order, orderHistorys);
		        	orderHistorysService.save(orderHistorys);
		        }
		  }
	}
	
}
