package co.com.sofka.app.domain.cinema.ticketoffice.entity;

import co.com.sofka.app.domain.cinema.function.value.SeatNumber;
import co.com.sofka.app.domain.cinema.ticketoffice.value.Schedule;
import co.com.sofka.app.domain.cinema.ticketoffice.value.TicketId;
import co.com.sofka.app.domain.cinema.ticketoffice.value.TicketPrice;
import co.com.sofka.domain.generic.AggregateEvent;

public class Ticket extends AggregateEvent<TicketId> {
    private TicketPrice ticketPrice;
    private SeatNumber seatNumber;
    private Schedule schedule;

    public Ticket(TicketId entityId, TicketPrice ticketPrice, SeatNumber seatNumber, Schedule schedule) {
        super(entityId);
        this.ticketPrice = ticketPrice;
        this.seatNumber = seatNumber;
        this.schedule = schedule;
    }

    public TicketPrice getTicketPrice() {
        return ticketPrice;
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
