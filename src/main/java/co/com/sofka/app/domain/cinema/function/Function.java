package co.com.sofka.app.domain.cinema.function;

import co.com.sofka.app.domain.cinema.catalog.Catalog;
import co.com.sofka.app.domain.cinema.catalog.CatalogChange;
import co.com.sofka.app.domain.cinema.catalog.events.CreatedCatalog;
import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.app.domain.cinema.function.entity.Room;
import co.com.sofka.app.domain.cinema.function.entity.Seat;
import co.com.sofka.app.domain.cinema.function.events.AssignedRoom;
import co.com.sofka.app.domain.cinema.function.events.CreatedFunction;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.app.domain.cinema.function.value.RoomId;
import co.com.sofka.app.domain.cinema.function.value.RoomNumber;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Function extends AggregateEvent<FunctionId> {
    protected OpeningHour openingHour;
    protected Room room;
    protected Set<Seat> seats;

    public Function(FunctionId entityId, OpeningHour openingHour, Room room) {
        super(entityId);
        this.openingHour = openingHour;
        this.room = room;
        Function(entityId,openingHour,room);
    }

    public Function(FunctionId id) {
        super(id);
    }

    private void Function(FunctionId id, OpeningHour openingHour, Room room){
        appendChange(new CreatedFunction(id,openingHour,room)).apply();
        subscribe(new FunctionChange(this));
    }

    public static Function from(FunctionId id, List<DomainEvent> retrieveEvents){
        var function = new Function(id);
        retrieveEvents.forEach(function::applyEvent);
        return function;
    }

    public void assignRoom(RoomId roomId, RoomNumber roomNumber, OpeningHour openingHour){
        Objects.requireNonNull(roomId);
        Objects.requireNonNull(roomNumber);
        Objects.requireNonNull(openingHour);
        appendChange(new AssignedRoom(roomId,roomNumber,openingHour)).apply();
    }

    public OpeningHour getOpeningHour() {
        return openingHour;
    }

    public Room getRoom() {
        return room;
    }

    public Set<Seat> getSeats() {
        return seats;
    }
}
