package pl.garlacz.karol.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.garlacz.karol.model.Ticket;
import pl.garlacz.karol.services.ITicketService;
import pl.garlacz.karol.session.SessionObject;

import javax.annotation.Resource;

@Controller
public class TicketController {

    @Autowired
    ITicketService ticketService;

    @Resource
    SessionObject sessionObject;

    @RequestMapping(value = "/ticket", method = RequestMethod.GET)
    public String addTicketForm(Model model){
        model.addAttribute("ticket", new Ticket());
        return "ticket";
    }

    @RequestMapping(value = "/ticket", method = RequestMethod.POST)
    public String addTicket(@ModelAttribute Ticket ticket){
        if(this.ticketService.addTicket(ticket)){
            return "index";
        }
        return "redirect:/ticket";
    }




}
