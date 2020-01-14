package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Employe;
//import com.rakuten.prj.service.OrderService;
import com.rakuten.prj.service.TicketService;

public class EmployeInsertClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketService.class);
		ctx.register(AppConfig.class);
		ctx.register(EmployeDaoJpaImpl.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.refresh();

		TicketService ts = ctx.getBean("ticketService", TicketService.class);
		Employe e = new Employe(4789,"rkaesh@","rakeshh","rathod");
		/*e.setEmpID(1234);
		e.setEmail("ramesh@");
		e.setfName("ramesh");
		e.setlName("satya");*/
		ts.insertEmploye(e);
		System.out.println("inserted");
	}

}
