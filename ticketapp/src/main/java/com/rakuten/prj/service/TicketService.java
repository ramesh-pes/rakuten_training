package com.rakuten.prj.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakuten.prj.dao.EmployeDao;
import com.rakuten.prj.dao.TicketDao;
import com.rakuten.prj.entity.Employe;
import com.rakuten.prj.entity.Ticket;

@Service
@Transactional
public class TicketService {
	@Autowired
	private EmployeDao employeDao;
	
	public void insertEmploye(Employe e) {
		employeDao.addEmploye(e);
	}
	public Employe getEmp(int id) {
		return employeDao.getEmploye(id);
	}
	
	@Autowired
	private TicketDao ticketDao;
	
	public void  raiseTick(String text , int id) {
		Ticket t=new Ticket();
		Employe e=employeDao.getEmploye(id);
		t.setResolvedBy(e);
		t.setTicketDesc(text);
		ticketDao.raiseTicket(t);
		
		
	}
	
	public List<Ticket> getOpenTickets(){
		return ticketDao.getAllOpenTickets();
	}
	
	public Ticket resolveOpenTicket(int ticket_id,int resolver_id,String text ) {
		Employe e=employeDao.getEmploye(resolver_id);
		Ticket t=ticketDao.getTicket(ticket_id);
		t.setResolvedBy(e);
		t.setResolvedDesc(text);
		t.setResolvedDate(new Date());
		return t;
		
	}
	
}
