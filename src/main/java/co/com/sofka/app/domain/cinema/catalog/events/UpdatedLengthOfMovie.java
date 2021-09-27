package co.com.sofka.app.domain.cinema.catalog.events;

import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedLengthOfMovie extends DomainEvent {
    private MovieId movieId;
    private Length length;

    public UpdatedLengthOfMovie(MovieId movieId, Length length){
        super("cinema.catalog.updatedlengthofmovie");
        this.movieId = movieId;
        this.length = length;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Length getLength() {
        return length;
    }
}
