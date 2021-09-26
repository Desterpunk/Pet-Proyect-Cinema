package co.com.sofka.app.domain.cinema.catalog;

import co.com.sofka.app.domain.cinema.catalog.entity.Movie;
import co.com.sofka.app.domain.cinema.catalog.events.CreatedCatalog;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class CatalogChange extends EventChange {
    public CatalogChange(Catalog catalog){
        apply((CreatedCatalog event) -> {
            catalog.movies = new HashSet<Movie>();
        });
    }
}
