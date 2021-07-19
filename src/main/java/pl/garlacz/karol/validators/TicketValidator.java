package pl.garlacz.karol.validators;

import pl.garlacz.karol.model.Ticket;

public class TicketValidator {
    public static boolean validateBasics(Ticket ticket){
        if(ticket.getPlate().equals("")){
            return false;
        }
        return true;
    }
}
