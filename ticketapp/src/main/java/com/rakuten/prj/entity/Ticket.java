package com.rakuten.prj.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tickets")
public class Ticket {

	@Id
	@Column(name="tick_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	
	@ManyToOne
	@JoinColumn(name="raisedBy_fk")
	//@Column(nullable = false)
	private Employe raisedBy;
	
	@Column(name = "raised_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date raisedDate = new Date();
	
	private String ticketDesc;
	
	@ManyToOne
	@JoinColumn(name="resolvedBy_fk")
	private Employe resolvedBy;
	
	@Column(name = "resolved_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resolvedDate;
	
	private String resolvedDesc;
	

	/**
	 * @return the tickets
	 */
	

	/**
	 * @param tickets the tickets to set
	 */
	

	/**
	 * @return the raisedBy
	 */
	public Employe getRaisedBy() {
		return raisedBy;
	}

	/**
	 * @return the ticketId
	 */
	public int getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * @param raisedBy the raisedBy to set
	 */
	public void setRaisedBy(Employe raisedBy) {
		this.raisedBy = raisedBy;
	}

	/**
	 * @return the raisedDate
	 */
	public Date getRaisedDate() {
		return raisedDate;
	}

	/**
	 * @param raisedDate the raisedDate to set
	 */
	public void setRaisedDate(Date raisedDate) {
		this.raisedDate = raisedDate;
	}

	/**
	 * @return the ticketDesc
	 */
	public String getTicketDesc() {
		return ticketDesc;
	}

	/**
	 * @param ticketDesc the ticketDesc to set
	 */
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}

	/**
	 * @return the resolvedBy
	 */
	public Employe getResolvedBy() {
		return resolvedBy;
	}

	/**
	 * @param resolvedBy the resolvedBy to set
	 */
	public void setResolvedBy(Employe resolvedBy) {
		this.resolvedBy = resolvedBy;
	}

	/**
	 * @return the resolvedDate
	 */
	public Date getResolvedDate() {
		return resolvedDate;
	}

	/**
	 * @param resolvedDate the resolvedDate to set
	 */
	public void setResolvedDate(Date resolvedDate) {
		this.resolvedDate = resolvedDate;
	}

	/**
	 * @return the resolvedDesc
	 */
	public String getResolvedDesc() {
		return resolvedDesc;
	}

	/**
	 * @param resolvedDesc the resolvedDesc to set
	 */
	public void setResolvedDesc(String resolvedDesc) {
		this.resolvedDesc = resolvedDesc;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", raisedBy=" + raisedBy + ", raisedDate=" + raisedDate
				+ ", ticketDesc=" + ticketDesc + ", resolvedBy=" + resolvedBy + ", resolvedDate=" + resolvedDate
				+ ", resolvedDesc=" + resolvedDesc + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((raisedBy == null) ? 0 : raisedBy.hashCode());
		result = prime * result + ((raisedDate == null) ? 0 : raisedDate.hashCode());
		result = prime * result + ((resolvedBy == null) ? 0 : resolvedBy.hashCode());
		result = prime * result + ((resolvedDate == null) ? 0 : resolvedDate.hashCode());
		result = prime * result + ((resolvedDesc == null) ? 0 : resolvedDesc.hashCode());
		result = prime * result + ((ticketDesc == null) ? 0 : ticketDesc.hashCode());
		result = prime * result + ticketId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		if (raisedBy == null) {
			if (other.raisedBy != null)
				return false;
		} else if (!raisedBy.equals(other.raisedBy))
			return false;
		if (raisedDate == null) {
			if (other.raisedDate != null)
				return false;
		} else if (!raisedDate.equals(other.raisedDate))
			return false;
		if (resolvedBy == null) {
			if (other.resolvedBy != null)
				return false;
		} else if (!resolvedBy.equals(other.resolvedBy))
			return false;
		if (resolvedDate == null) {
			if (other.resolvedDate != null)
				return false;
		} else if (!resolvedDate.equals(other.resolvedDate))
			return false;
		if (resolvedDesc == null) {
			if (other.resolvedDesc != null)
				return false;
		} else if (!resolvedDesc.equals(other.resolvedDesc))
			return false;
		if (ticketDesc == null) {
			if (other.ticketDesc != null)
				return false;
		} else if (!ticketDesc.equals(other.ticketDesc))
			return false;
		if (ticketId != other.ticketId)
			return false;
		return true;
	}
	
	
	
	
}
