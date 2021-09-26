package co.com.sofka.app.domain.cinema.catalog.commands;

import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.domain.generic.Command;

public class CreateCatalog implements Command {
    private final CatalogId id;

    public CreateCatalog(CatalogId id){
        this.id = id;
    }

    public CatalogId getId() {
        return id;
    }
}
