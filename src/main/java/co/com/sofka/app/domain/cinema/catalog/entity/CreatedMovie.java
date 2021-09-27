package co.com.sofka.app.domain.cinema.catalog.entity;

import co.com.sofka.app.domain.cinema.catalog.value.Clasification;
import co.com.sofka.app.domain.cinema.catalog.value.Format;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedMovie extends DomainEvent {
    private MovieId movieId;
    private Clasification clasification;
    private Length length;
    private Format format;

    public CreatedMovie(MovieId movieId, Clasification clasification, Length length, Format format){
        super("cinema.catalog.createdmovie");
        this.movieId = movieId;
        this.clasification = clasification;
        this.length = length;
        this.format = format;
    }

    public MovieId getMovieId() {
        return movieId;
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
