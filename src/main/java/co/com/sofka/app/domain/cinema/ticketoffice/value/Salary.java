package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Salary implements ValueObject<String> {
    private final String value;
    public Salary(String value){
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
