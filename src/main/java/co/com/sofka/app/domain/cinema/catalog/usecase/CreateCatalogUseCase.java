package co.com.sofka.app.domain.cinema.catalog.usecase;

import co.com.sofka.app.domain.cinema.catalog.Catalog;
import co.com.sofka.app.domain.cinema.catalog.commands.CreateCatalog;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CreateCatalogUseCase extends UseCase<RequestCommand<CreateCatalog>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateCatalog> createCatalogRequestCommand) {
        var command = createCatalogRequestCommand.getCommand();
        var catalog = new Catalog(command.getId());
        emit().onResponse(new ResponseEvents(catalog.getUncommittedChanges()));
    }
}
