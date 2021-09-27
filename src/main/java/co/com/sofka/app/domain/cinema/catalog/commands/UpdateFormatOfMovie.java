package co.com.sofka.app.domain.cinema.catalog.commands;

import co.com.sofka.app.domain.cinema.catalog.value.Format;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.Command;

public class UpdateFormatOfMovie implements Command {
    private final MovieId movieId;
    private final Format format;

    public UpdateFormatOfMovie(MovieId movieId, Format format){
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
