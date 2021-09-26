package co.com.sofka.app.domain.cinema.function.entity;

import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.app.domain.cinema.function.value.RoomId;
import co.com.sofka.app.domain.cinema.function.value.RoomNumber;
import co.com.sofka.domain.generic.Entity;

public class Room extends Entity<RoomId> {
    private RoomNumber roomNumber;
    private OpeningHour openingHour;

    public Room(RoomId entityId, RoomNumber roomNumber, OpeningHour openingHour) {
        super(entityId);
        this.roomNumber = roomNumber;
        this.openingHour = openingHour;
    }

    public RoomNumber getRoomNumber() {
        return roomNumber;
    }

    public OpeningHour getOpeningHour() {
        return openingHour;
    }
}
