package pl.garlacz.karol.database;

import pl.garlacz.karol.model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Ticket> tickets = new ArrayList<>();

    public Database() {
        tickets.add(new Ticket(1,"BMW", "Seria3", "KR111", 1));
    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }
}