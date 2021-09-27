package co.com.sofka.app.domain.cinema.function.events;

import co.com.sofka.app.domain.cinema.function.entity.Room;
import co.com.sofka.app.domain.cinema.function.entity.Seat;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedFunction extends DomainEvent {
    private final FunctionId functionId;
    private final OpeningHour openingHour;
    private final Room room;

    public CreatedFunction(FunctionId functionId,OpeningHour openingHour, Room room) {
        super("cinema.function.createdfunction");
        this.functionId = functionId;
        this.openingHour = openingHour;
        this.room = room;
    }

    public OpeningHour getOpeningHour() {
        return openingHour;
    }

    public Room getRoom() {
        return room;
    }
}
