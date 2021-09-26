package co.com.sofka.app.domain.cinema.ticketoffice.entity;

import co.com.sofka.app.domain.cinema.ticketoffice.value.*;
import co.com.sofka.domain.generic.Entity;

public class TicketAgent extends Entity<TicketAgentId> {
    private Name name;
    private Email email;
    private Salary salary;

    public TicketAgent(TicketAgentId entityId, Name name, Email email, Salary salary) {
        super(entityId);
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }

    public Salary getSalary() {
        return salary;
    }
}
