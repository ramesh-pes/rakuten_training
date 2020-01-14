package com.rakuten.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.rakuten.prj.entity.Ticket;

@Repository
public class TicketDaoJpaImpl implements TicketDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void raiseTicket(Ticket ticket) {
		em.persist(ticket);
	}

	@Override
	public List<Ticket> getAllOpenTickets() {
		// TODO Auto-generated method stub
		String jpql="from Ticket where resolvedBy is NULL";
		TypedQuery<Ticket> query =em.createQuery(jpql,Ticket.class);
		return query.getResultList();
	}

	@Override
	public Ticket getTicket(int id) {
		
		return em.find(Ticket.class, id);
	}
	
	

}
