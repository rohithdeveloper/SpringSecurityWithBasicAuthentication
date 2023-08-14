package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ticket;

public interface TicketService {

	Ticket addTicket( Ticket  ticket);
	Ticket getTicketById(int ticketId);
	List<Ticket> getAllTickets();
}
