package co.com.sofka.app.domain.cinema.catalog.value;

import co.com.sofka.domain.generic.Identity;

public class CatalogId extends Identity {
    public CatalogId() {
    }
    private CatalogId(String id) {
        super(id);
    }
    public static CatalogId of(String id){
        return new CatalogId(id);
    }
}
