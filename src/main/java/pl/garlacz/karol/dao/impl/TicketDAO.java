package pl.garlacz.karol.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.garlacz.karol.dao.ITicketDAO;
import pl.garlacz.karol.model.Ticket;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TicketDAO implements ITicketDAO {

    @Autowired
    Connection connection;


/*    public List<Ticket> getAllTickets() {
        List<Ticket> result = new ArrayList<>();
        try {
            String sql = "SELECT * FROM tticket";

            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                result.add(mapTicket(rs));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return result;
    }*/

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

       /* private Ticket mapTicket(ResultSet rs){
            try{
                Ticket ticket = new Ticket();
                ticket.setId(rs.getInt("id"));
                ticket.setBrand(rs.getString("brand"));
                ticket.setModel(rs.getString("model"));
                ticket.setPlate(rs.getString("plate"));


                return ticket;

            }catch (SQLException e){
                e.printStackTrace();
            }
            return null;
        }*/
    }
}
