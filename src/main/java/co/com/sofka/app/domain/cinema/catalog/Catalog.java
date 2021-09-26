package co.com.sofka.app.domain.cinema.catalog;

import co.com.sofka.app.domain.cinema.catalog.entity.Movie;
import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Set;

public class Catalog extends AggregateEvent<CatalogId> {

    protected Set<Movie> movies;

    public Catalog(CatalogId id){
        super(id);
    }
}
