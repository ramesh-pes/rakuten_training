package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
//import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.entity.Customer;
import com.rakuten.prj.entity.Product;
import com.rakuten.prj.service.OrderService;

public class CustomerFetchClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(OrderService.class);
		ctx.register(AppConfig.class);
		ctx.register(CustomerDaoJpaImpl.class);
		ctx.register(ProductDaoJpaImpl.class);
		ctx.refresh();
		
		OrderService os = ctx.getBean("orderService",OrderService.class);
		List<Customer> customers = os.getAllCust();
		for (Customer c1 : customers) {
			System.out.println(c1);
		}
	}

}
