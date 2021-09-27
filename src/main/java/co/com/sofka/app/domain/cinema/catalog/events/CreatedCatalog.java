package co.com.sofka.app.domain.cinema.catalog.events;

import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedCatalog extends DomainEvent {
    private final CatalogId catalogId;
    public CreatedCatalog(CatalogId catalogId){
        super("cinema.catalog.createdcatalog");
        this.catalogId = catalogId;
    }

    public CatalogId getCatalogId(){
        return catalogId;
    }
}
