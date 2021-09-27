package co.com.sofka.app.domain.cinema.catalog.commands;

import co.com.sofka.app.domain.cinema.catalog.value.Clasification;
import co.com.sofka.app.domain.cinema.catalog.value.Length;
import co.com.sofka.app.domain.cinema.catalog.value.MovieId;
import co.com.sofka.domain.generic.Command;

public class UpdateClasificationOfMovie implements Command {
    private final MovieId movieId;
    private final Clasification clasification;

    public UpdateClasificationOfMovie(MovieId movieId, Clasification clasification){
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
