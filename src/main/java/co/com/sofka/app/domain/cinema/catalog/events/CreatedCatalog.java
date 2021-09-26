package co.com.sofka.app.domain.cinema.catalog.events;

import co.com.sofka.domain.generic.DomainEvent;

public class CreatedCatalog extends DomainEvent {

    public CreatedCatalog(){
        super("cinema.catalog.createdcatalog");
    }
}
