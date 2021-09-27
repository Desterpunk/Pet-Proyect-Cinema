package co.com.sofka.app.domain.cinema.catalog.events;

import co.com.sofka.app.domain.cinema.catalog.value.Clasification;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedClasificationOfMovie extends DomainEvent {
    private MovieId movieId;
    private Clasification clasification;

    public UpdatedClasificationOfMovie(MovieId movieId, Clasification clasification){
        super("cinema.catalog.updatedclasificationofmovie");
        this.movieId = movieId;
        this.clasification = clasification;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Clasification getClasification() {
        return clasification;
    }
}
