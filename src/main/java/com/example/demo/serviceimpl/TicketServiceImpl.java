package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Ticket;
import com.example.demo.exception.TicketNotFoundException;
import com.example.demo.repository.TicketDao;
import com.example.demo.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;
	
	@Override
	public Ticket getTicketById(int ticketId) {
		// TODO Auto-generated method stub
		Optional<Ticket> ticket=ticketDao.findById(ticketId);
			return ticket.get();
		
		
	}

	@Override
	public List<Ticket> getAllTickets() {
		// TODO Auto-generated method stub
		return ticketDao.findAll();
	}

	@Override
	public Ticket addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.save(ticket);
	}

}
