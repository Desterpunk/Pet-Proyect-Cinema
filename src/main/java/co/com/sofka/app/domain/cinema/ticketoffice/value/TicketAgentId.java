package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.Identity;

public class TicketAgentId extends Identity {
    public TicketAgentId(){

    }
    private TicketAgentId(String id){
        super(id);
    }

    public static TicketAgentId of(String id){
        return new TicketAgentId(id);
    }
}
