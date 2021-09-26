package co.com.sofka.app.domain.cinema.ticketoffice;

import co.com.sofka.app.domain.cinema.ticketoffice.entity.Ticket;
import co.com.sofka.app.domain.cinema.ticketoffice.events.CreatedTicketOffice;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class TicketOfficeChange extends EventChange {
    public TicketOfficeChange(TicketOffice ticketOffice){
        apply((CreatedTicketOffice event) -> {
            ticketOffice.place = event.getPlace();
            ticketOffice.tickets = new HashSet<Ticket>();
            ticketOffice.ticketAgent = event.getTicketAgent();
        });
    }
}
