package pl.garlacz.karol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.garlacz.karol.dao.ITicketDAO;
import pl.garlacz.karol.dao.impl.TicketDAO;
import pl.garlacz.karol.model.Ticket;

@Controller
public class HackController {

    @Autowired
    TicketDAO ticketDAO;

    @RequestMapping(value ="/hack/tickets", method = RequestMethod.GET)
    public String addTickets(){
        ticketDAO.addTicket(new Ticket(1, "Citroen", "DS5", "KR111", 1));

        return "redirect/index";
    }
}
