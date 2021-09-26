package co.com.sofka.app.domain.cinema.ticketoffice.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Place implements ValueObject<String> {
    private final String city;

    public Place(String city) {
        this.city = Objects.requireNonNull(city);
    }

    @Override
    public String value() {
        return value();
    }
}
