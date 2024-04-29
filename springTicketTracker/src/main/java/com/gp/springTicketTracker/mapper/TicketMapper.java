package com.gp.springTicketTracker.mapper;

import com.gp.springTicketTracker.dto.TicketDto;
import com.gp.springTicketTracker.entity.Ticket;

//It will map Ticket Entity to TicketDto and vice version
public class TicketMapper {

	// map Ticket Entity to Ticket DTO

	public static TicketDto mapToTicketDto(Ticket ticket) {
		return TicketDto.builder().id(ticket.getId()).title(ticket.getTitle()).url(ticket.getUrl())
				.content(ticket.getContent()).shortDescription(ticket.getShortDescription())
				.createdOn(ticket.getCreatedOn()).updatedOn(ticket.getUpdatedOn()).build();
	}

	// map TicketDto to Ticket entity
	public static Ticket mapToTicket(TicketDto ticketDto) {
		return Ticket.builder().id(ticketDto.getId()).title(ticketDto.getTitle()).content(ticketDto.getContent())
				.url(ticketDto.getUrl()).shortDescription(ticketDto.getShortDescription())
				.createdOn(ticketDto.getCreatedOn()).updatedOn(ticketDto.getUpdatedOn()).build();
	}
}
