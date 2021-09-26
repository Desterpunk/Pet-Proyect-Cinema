package co.com.sofka.app.domain.cinema.ticketoffice;

import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.app.domain.cinema.ticketoffice.entity.Ticket;
import co.com.sofka.app.domain.cinema.ticketoffice.entity.TicketAgent;
import co.com.sofka.app.domain.cinema.ticketoffice.value.Place;
import co.com.sofka.app.domain.cinema.ticketoffice.value.TicketOfficeId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class TicketOffice extends AggregateEvent<TicketOfficeId> {
    protected Set<Ticket> tickets;
    protected TicketAgent ticketAgent;
    protected Place place;

    public TicketOffice(TicketOfficeId entityId, Place place, TicketAgent ticketAgent) {
        super(entityId);
        this.ticketAgent = ticketAgent;
        this.place = place;
    }

    public Set<Ticket> getTickets() {
        return tickets;
    }

    public TicketAgent getTicketAgent() {
        return ticketAgent;
    }

    public Place getPlace() {
        return place;
    }
}
