package co.com.sofka.app.domain.cinema.function.entity;

import co.com.sofka.app.domain.cinema.function.value.*;
import co.com.sofka.domain.generic.Entity;

public class Seat extends Entity<SeatId> {
    private SeatNumber seatNumber;
    private Zone zone;
    private Row row;

    public Seat(SeatId entityId, SeatNumber seatNumber, Zone zone, Row row) {
        super(entityId);
        this.seatNumber = seatNumber;
        this.zone = zone;
        this.row = row;
    }

    public SeatNumber getSeatNumber() {
        return seatNumber;
    }

    public Zone getZone() {
        return zone;
    }

    public Row getRow() {
        return row;
    }
}
