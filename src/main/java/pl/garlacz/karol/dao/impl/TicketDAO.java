package pl.garlacz.karol.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import pl.garlacz.karol.model.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TicketDAO {

    @Autowired
    Connection connection;

    public void addTicket(Ticket ticket){
        try{
            String sql = "INSERT INTO tticket(brand, model, plate) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);

            preparedStatement.setString(1, ticket.getBrand());
            preparedStatement.setString(2,ticket.getModel());
            preparedStatement.setString(3,ticket.getPlate());

            preparedStatement.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
