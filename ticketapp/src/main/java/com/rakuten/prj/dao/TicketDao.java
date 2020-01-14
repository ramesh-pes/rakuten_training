package com.rakuten.prj.dao;

import java.util.List;

import com.rakuten.prj.entity.Ticket;

public interface TicketDao {
	void raiseTicket(Ticket ticket);
	Ticket getTicket(int id);
	List<Ticket> getAllOpenTickets();
}
