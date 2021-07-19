package pl.garlacz.karol.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.garlacz.karol.dao.ITicketDAO;
import pl.garlacz.karol.model.Ticket;
import pl.garlacz.karol.services.ITicketService;
import pl.garlacz.karol.session.SessionObject;
import pl.garlacz.karol.validators.TicketValidator;

import javax.annotation.Resource;

@Service
public class TicketServices implements ITicketService {

    @Autowired
    ITicketDAO ticketDAO;

    @Resource
    SessionObject sessionObject;

    public boolean addTicket(Ticket ticket){
        if(!TicketValidator.validateBasics(ticket)){
            this.sessionObject.setInfo("Nie podałeś numeru tablicy");
            return false;
        }
        this.ticketDAO.addTicket(ticket);
        return true;
    }

}
