package co.com.sofka.app.domain.cinema.function.commands;

import co.com.sofka.app.domain.cinema.function.entity.Room;
import co.com.sofka.app.domain.cinema.function.entity.Seat;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.app.domain.cinema.function.value.OpeningHour;
import co.com.sofka.domain.generic.Command;

public class CreateFunction implements Command {
    private final FunctionId functionId;
    private final OpeningHour openingHour;
    private final Room room;

    public CreateFunction(FunctionId functionId, OpeningHour openingHour, Room room) {
        this.functionId = functionId;
        this.openingHour = openingHour;
        this.room = room;
    }
}


