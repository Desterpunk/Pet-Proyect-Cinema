package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TicketPrice implements ValueObject<String> {
    private final String value;

    public TicketPrice(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("ERROR");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
