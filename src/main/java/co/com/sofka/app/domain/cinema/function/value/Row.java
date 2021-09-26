package co.com.sofka.app.domain.cinema.function.value;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Row implements ValueObject<String> {
    private final String value;

    public Row(String value) {
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
