package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.Identity;

public class TicketOfficeId extends Identity {
    public TicketOfficeId(){

    }
    private TicketOfficeId(String id){
        super(id);
    }

    public static TicketOfficeId of(String id){
        return new TicketOfficeId(id);
    }
}
