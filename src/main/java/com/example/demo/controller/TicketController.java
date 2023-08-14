package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ticket;
import com.example.demo.service.TicketService;

@RestController
@RequestMapping("/api")
public class TicketController {

	@Autowired
	private TicketService ticketservice;
	
	@PostMapping("/addtickets")
	public Ticket addTickets(@RequestBody Ticket ticket) {
		return ticketservice.addTicket(ticket);
	}
	
	@GetMapping("/tickets/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") int ticketId) {
		return ticketservice.getTicketById(ticketId);
		
	}
	
	@GetMapping("/getalltickets")
	public List<Ticket> getAllBookedTickets(){
		List<Ticket> list=ticketservice.getAllTickets();
		return list;
	}
	
}
