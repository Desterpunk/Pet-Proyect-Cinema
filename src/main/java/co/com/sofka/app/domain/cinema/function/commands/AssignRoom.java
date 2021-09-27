package co.com.sofka.app.domain.cinema.function.commands;

import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.app.domain.cinema.function.value.RoomId;
import co.com.sofka.app.domain.cinema.function.value.RoomNumber;
import co.com.sofka.domain.generic.Command;

public class AssignRoom implements Command {
    private final RoomId roomId;
    private final RoomNumber roomNumber;
    private final OpeningHour openingHour;

    public AssignRoom(RoomId roomId, RoomNumber roomNumber, OpeningHour openingHour) {
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.openingHour = openingHour;
    }

    public RoomId getRoomId() {
        return roomId;
    }

    public RoomNumber getRoomNumber() {
        return roomNumber;
    }

    public OpeningHour getOpeningHour() {
        return openingHour;
    }
}
