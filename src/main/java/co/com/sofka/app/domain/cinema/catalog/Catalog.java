package co.com.sofka.app.domain.cinema.catalog;

import co.com.sofka.app.domain.cinema.catalog.events.*;
import co.com.sofka.app.domain.cinema.catalog.entity.Movie;
import co.com.sofka.app.domain.cinema.catalog.value.*;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Catalog extends AggregateEvent<CatalogId> {

    protected Set<Movie> movies;

    public Catalog(CatalogId id){
        super(id);
        Catalog(id);
    }

    private void Catalog(CatalogId id){
        appendChange(new CreatedCatalog(id)).apply();
        subscribe(new CatalogChange(this));
    }

    public static Catalog from(CatalogId id, List<DomainEvent> retrieveEvents){
        var catalog = new Catalog(id);
        retrieveEvents.forEach(catalog::applyEvent);
        return catalog;
    }

    //events
    public void addMovie(MovieId movieId, Clasification clasification, Length length, Format format){
        Objects.requireNonNull(movieId);
        Objects.requireNonNull(clasification);
        Objects.requireNonNull(length);
        Objects.requireNonNull(format);
        appendChange(new AddedMovie(movieId, clasification, length, format));
    }
    public void updateLengthOfMovie(MovieId movieId, Length length){
        Objects.requireNonNull(movieId);
        Objects.requireNonNull(length);
        appendChange(new UpdatedLengthOfMovie(movieId, length));
    }
    public void updateClasificationOfMovie(MovieId movieId, Clasification clasification){
        Objects.requireNonNull(movieId);
        Objects.requireNonNull(clasification);
        appendChange(new UpdatedClasificationOfMovie(movieId,clasification));
    }
    public void updateFormatOfMovie(MovieId movieId, Format format){
        Objects.requireNonNull(movieId);
        Objects.requireNonNull(format);
        appendChange(new UpdatedFormatOfMovie(movieId,format));
    }
    public Set<Movie> getMovies() {
        return movies;
    }
}
