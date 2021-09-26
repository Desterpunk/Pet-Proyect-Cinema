package co.com.sofka.app.domain.cinema.ticketoffice.commands;

import co.com.sofka.app.domain.cinema.ticketoffice.entity.TicketAgent;
import co.com.sofka.app.domain.cinema.ticketoffice.value.Place;
import co.com.sofka.app.domain.cinema.ticketoffice.value.TicketOfficeId;
import co.com.sofka.domain.generic.Command;

public class CreateTicketOffice implements Command {
    private final TicketOfficeId id;
    private final Place place;
    private final TicketAgent ticketAgent;

    public CreateTicketOffice(TicketOfficeId id, Place place, TicketAgent ticketAgent){
        this.id = id;
        this.place = place;
        this.ticketAgent = ticketAgent;
    }

    public TicketOfficeId getId() {
        return id;
    }

    public Place getPlace() {
        return place;
    }

    public TicketAgent getTicketAgent() {
        return ticketAgent;
    }
}
