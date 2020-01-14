package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.CustomerDaoJpaImpl;
import com.rakuten.prj.dao.OrderDaoJpaImpl;
import com.rakuten.prj.dao.ProductDaoJpaImpl;
import com.rakuten.prj.service.OrderService;

public class OrderInsertClient {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(OrderService.class);
		ctx.register(ProductDaoJpaImpl.class);
		ctx.register(AppConfig.class);
		ctx.register(CustomerDaoJpaImpl.class);
		ctx.register(OrderDaoJpaImpl.class);
		// ctx.register(LineItemDaoJpaImpl.class);

		ctx.refresh();

		OrderService os = ctx.getBean("orderService", OrderService.class);
		int[] pid= {1,2};
		int[] qts= {40,15};
		os.placeOrder("ramesh@gmail.com", pid, qts);
		System.out.println("order placed");
	}

}
