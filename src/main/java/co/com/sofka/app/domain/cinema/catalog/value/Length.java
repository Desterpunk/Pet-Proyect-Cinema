package co.com.sofka.app.domain.cinema.catalog.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Length implements ValueObject<String> {
    private final String value;

    public Length(String value) {
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
