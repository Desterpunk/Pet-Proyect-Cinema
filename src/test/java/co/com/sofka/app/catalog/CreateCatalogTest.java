package co.com.sofka.app.catalog;

import co.com.sofka.app.domain.cinema.catalog.commands.CreateCatalog;
import co.com.sofka.app.domain.cinema.catalog.events.CreatedCatalog;
import co.com.sofka.app.domain.cinema.catalog.usecase.CreateCatalogUseCase;
import co.com.sofka.app.domain.cinema.catalog.value.CatalogId;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

public class CreateCatalogTest {
    private CreateCatalogUseCase createCatalogUseCase;
    @BeforeEach
    public void setup(){
        createCatalogUseCase = new CreateCatalogUseCase();
    }

    @Test
    @DisplayName("Testing id catalog: id = 1")
    void createCatalog() {
        var command  = new CreateCatalog(CatalogId.of("1"));

        var response = UseCaseHandler.getInstance().syncExecutor(
                createCatalogUseCase, new RequestCommand<>(command)
        ).orElseThrow();
        var events = response.getDomainEvents();

        CreatedCatalog createdCatalog = (CreatedCatalog) events.get(0);
        Assertions.assertEquals("1",createdCatalog.getCatalogId().value());
    }
}
