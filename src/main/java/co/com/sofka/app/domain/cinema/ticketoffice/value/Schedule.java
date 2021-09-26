package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Schedule implements ValueObject<String> {
    private final String value;

    public Schedule(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("ERROR");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
