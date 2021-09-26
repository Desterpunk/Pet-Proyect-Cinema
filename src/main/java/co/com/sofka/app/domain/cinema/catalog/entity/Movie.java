package co.com.sofka.app.domain.cinema.catalog.entity;

import co.com.sofka.app.domain.cinema.catalog.value.Clasification;
import co.com.sofka.app.domain.cinema.catalog.value.Format;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.Entity;

public class Movie extends Entity<MovieId> {
    private Clasification clasification;
    private Length length;
    private Format format;

    public Movie(MovieId entityId, Clasification clasification, Length length, Format format) {
        super(entityId);
        this.clasification = clasification;
        this.length = length;
        this.format = format;
    }

    public Clasification getClasification() {
        return clasification;
    }

    public Length getLength() {
        return length;
    }

    public Format getFormat() {
        return format;
    }
}
