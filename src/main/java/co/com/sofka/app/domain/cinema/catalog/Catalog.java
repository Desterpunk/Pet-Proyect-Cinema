package co.com.sofka.app.domain.cinema.catalog;

import co.com.sofka.app.domain.cinema.catalog.entity.Movie;
import co.com.sofka.app.domain.cinema.catalog.events.CreatedCatalog;
import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.app.domain.cinema.function.value.FunctionId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.List;
import java.util.Set;

public class Catalog extends AggregateEvent<CatalogId> {

    protected Set<Movie> movies;

    public Catalog(CatalogId id){
        super(id);
        Catalog(id);
    }

    public void Catalog(CatalogId id){
        appendChange(new CreatedCatalog(id)).apply();
    }

    public static Catalog from(CatalogId id, List<DomainEvent> retrieveEvents){
        var catalog = new Catalog(id);
        retrieveEvents.forEach(catalog::applyEvent);
        return catalog;
    }
}
