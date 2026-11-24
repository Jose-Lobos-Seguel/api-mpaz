package com.mpaz.tickets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpaz.tickets.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {

}
