package co.com.sofka.app.domain.cinema.function;

import co.com.sofka.app.domain.cinema.function.entity.Room;
import co.com.sofka.app.domain.cinema.function.entity.Seat;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Function extends AggregateEvent<FunctionId> {
    protected OpeningHour openingHour;
    protected Room room;
    protected Set<Seat> seats;

    public Function(FunctionId entityId, OpeningHour openingHour, Room room) {
        super(entityId);
        this.openingHour = openingHour;
        this.room = room;
    }
}
