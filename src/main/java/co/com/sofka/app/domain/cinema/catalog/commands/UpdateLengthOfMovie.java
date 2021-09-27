package co.com.sofka.app.domain.cinema.catalog.commands;

import co.com.sofka.app.domain.cinema.catalog.events.UpdatedLengthOfMovie;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.Command;

public class UpdateLengthOfMovie implements Command {
    private final MovieId movieId;
    private final Length length;

    public UpdateLengthOfMovie(MovieId movieId, Length length){
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
