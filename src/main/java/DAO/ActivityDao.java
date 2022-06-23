/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Activity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author GuilhermeFCM
 */
public class ActivityDao {
    public List<Activity> selectAll(){
        Connection connection = DaoConnection.getConnection();
        List<Activity> activities = new ArrayList();
        String query = "select * from activities;";
        
        try {
            Statement stm = connection.createStatement();
            ResultSet result = stm.executeQuery(query);
            
            while(result.next()){
                int id = result.getInt("id");
                String title = result.getString("title");
                String description = result.getString("description");
                String teacher = result.getString("teacher");
                String subject = result.getString("subject");
                Date deadline = result.getDate("deadline");
                
                activities.add( new Activity(id, title, description, teacher, subject, deadline) );
            }
        } catch(SQLException ex) {
            System.err.println("Erro de conexão.");
        }
        
        return activities;
    }
    
//    public Activity selectOne(int id){
//        
//    }
//    
//    public boolean insert(Activity activity){
//        
//    }
//    
//    public boolean update(Activity activity){
//        
//    }
//    
//    public boolean delete(int id){
//        
//    }
}
