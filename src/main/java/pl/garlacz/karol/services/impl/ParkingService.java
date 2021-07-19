package pl.garlacz.karol.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.garlacz.karol.dao.ITicketDAO;
import pl.garlacz.karol.session.SessionObject;

import javax.annotation.Resource;

public class ParkingService {

    @Autowired
    ITicketDAO ticketDAO;

    @Resource
    SessionObject sessionObject;


}
