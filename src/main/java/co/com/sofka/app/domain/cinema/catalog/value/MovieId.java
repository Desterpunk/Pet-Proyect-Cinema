package co.com.sofka.app.domain.cinema.catalog.value;

import co.com.sofka.domain.generic.Identity;

public class MovieId extends Identity {
    public MovieId(){

    }
    private MovieId(String id){
        super(id);
    }

    private MovieId of(String id){
        return new MovieId(id);
    }
}
