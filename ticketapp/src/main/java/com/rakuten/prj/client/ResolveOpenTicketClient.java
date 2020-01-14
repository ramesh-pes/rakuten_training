package com.rakuten.prj.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Ticket;
import com.rakuten.prj.service.TicketService;

public class ResolveOpenTicketClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketService.class);
		ctx.register(AppConfig.class);
		ctx.register(EmployeDaoJpaImpl.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.refresh();

		TicketService ts = ctx.getBean("ticketService", TicketService.class);
		Ticket t=ts.resolveOpenTicket(3, 1234, "i know that u r there");
		System.out.println("resolved successfully");
	}

}
