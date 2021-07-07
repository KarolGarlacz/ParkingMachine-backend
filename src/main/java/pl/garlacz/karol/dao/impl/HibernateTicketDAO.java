package pl.garlacz.karol.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import pl.garlacz.karol.model.Ticket;

@Repository
public class HibernateTicketDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void addTicket(Ticket ticket){
        Session session = this.sessionFactory.openSession();
        Transaction tx = null;
        try{
           // tx.session.beginTransaction();
        } catch(Exception e){
            if(tx != null)
                tx.rollback();
        } finally {
            session.close();
        }

    }
}
