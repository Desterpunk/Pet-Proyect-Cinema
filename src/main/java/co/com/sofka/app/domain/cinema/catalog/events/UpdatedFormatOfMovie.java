package co.com.sofka.app.domain.cinema.catalog.events;

import co.com.sofka.app.domain.cinema.catalog.value.Format;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.DomainEvent;

public class UpdatedFormatOfMovie extends DomainEvent {
    private MovieId movieId;
    private Format format;

    public UpdatedFormatOfMovie(MovieId movieId, Format format){
        super("cinema.catalog.updatedformatofmovie");
        this.movieId = movieId;
        this.format = format;
    }

    public MovieId getMovieId() {
        return movieId;
    }

    public Format getFormat() {
        return format;
    }
}
