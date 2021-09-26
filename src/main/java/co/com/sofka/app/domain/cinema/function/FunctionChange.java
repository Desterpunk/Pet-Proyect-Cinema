package co.com.sofka.app.domain.cinema.function;

import co.com.sofka.app.domain.cinema.function.entity.Seat;
import co.com.sofka.app.domain.cinema.function.events.CreatedFunction;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class FunctionChange extends EventChange {
    public FunctionChange(Function function){
        apply((CreatedFunction event) -> {
            function.room = event.getRoom();
            function.seats = new HashSet<Seat>();
            function.openingHour = event.getOpeningHour();
        });
    }
}
