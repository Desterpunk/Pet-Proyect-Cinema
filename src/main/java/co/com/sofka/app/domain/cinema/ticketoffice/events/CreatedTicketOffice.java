package co.com.sofka.app.domain.cinema.ticketoffice.events;

import co.com.sofka.app.domain.cinema.ticketoffice.entity.TicketAgent;
import co.com.sofka.app.domain.cinema.ticketoffice.value.Place;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedTicketOffice extends DomainEvent {
    private final Place place;
    private final TicketAgent ticketAgent;

    public CreatedTicketOffice(Place place, TicketAgent ticketAgent){
        super("cinema.ticketoffice.createdticketoffice");
        this.place = place;
        this.ticketAgent = ticketAgent;
    }

    public Place getPlace() {
        return place;
    }

    public TicketAgent getTicketAgent() {
        return ticketAgent;
    }
}
