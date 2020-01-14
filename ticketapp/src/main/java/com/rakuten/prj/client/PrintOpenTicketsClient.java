package com.rakuten.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rakuten.prj.cfg.AppConfig;
import com.rakuten.prj.dao.EmployeDaoJpaImpl;
import com.rakuten.prj.dao.TicketDaoJpaImpl;
import com.rakuten.prj.entity.Ticket;
import com.rakuten.prj.service.TicketService;

public class PrintOpenTicketsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(TicketService.class);
		ctx.register(AppConfig.class);
		ctx.register(EmployeDaoJpaImpl.class);
		ctx.register(TicketDaoJpaImpl.class);
		ctx.refresh();

		TicketService ts = ctx.getBean("ticketService", TicketService.class);
		List<Ticket>tk=ts.getOpenTickets();
		for (Ticket t : tk) {
			System.out.println(t);
		}
		System.out.println("open tickets generated succesfuly");
	}

}
