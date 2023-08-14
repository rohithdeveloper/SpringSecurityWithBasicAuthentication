package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Ticket_Id")
	private int ticketId;
	
	@Column(name="Passenger_Name",nullable=false)
	private String passengerName;
	
	
	@Column(name="Source_Place")
	private String source;
	
	@Column(name="Destination_Place")
	private String destination;
	
	@Column(name="Email")
	private String email;

	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ticket(int ticketId, String passengerName, String source, String destination,
			String email) {
		super();
		this.ticketId = ticketId;
		this.passengerName = passengerName;
	
		this.source = source;
		this.destination = destination;
		this.email = email;
	}

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}


	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName +
				 ", source=" + source + ", destination=" + destination + ", email=" + email + "]";
	}
	

}
