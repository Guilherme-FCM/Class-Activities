/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.Activity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GuilhermeFCM
 */
public class ActivityDao {
    public List<Activity> selectAll(){
        Connection connection = DaoConnection.getConnection();
        List<Activity> activities = new ArrayList();
        
        try {
            PreparedStatement stm = connection.prepareStatement(
                "select * from activities;"
            );
            ResultSet result = stm.executeQuery();
            
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
            Logger.getLogger(ActivityDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return activities;
    }
    
    public Activity selectOne(int id){
        Connection connection = DaoConnection.getConnection();
        
        try {
            PreparedStatement stm = connection.prepareStatement(
                "select * from activities where id = ?;"
            );
            stm.setInt(1, id);
            ResultSet result = stm.executeQuery();
            result.next();
            
            String title = result.getString("title");
            String description = result.getString("description");
            String teacher = result.getString("teacher");
            String subject = result.getString("subject");
            Date deadline = result.getDate("deadline");
                
            return new Activity(id, title, description, teacher, subject, deadline);
        } catch(SQLException ex) {
            Logger.getLogger(ActivityDao.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int insert(Activity activity){
        Connection connection = DaoConnection.getConnection();
        try {
            PreparedStatement stm = connection.prepareStatement(
                "insert into Activities (title, description, teacher, subject, deadline) values (?, ?, ?, ?, ?);"
            );
            stm.setString(1, activity.getTitle());
            stm.setString(2, activity.getDescription());
            stm.setString(3, activity.getTeacher());
            stm.setString(4, activity.getSubject());
            stm.setDate(5, activity.getDeadline());
            
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ActivityDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int update(Activity activity){
        Connection connection = DaoConnection.getConnection();
        try {
            PreparedStatement stm = connection.prepareStatement(
                "update Activities set title = ?, description = ?, teacher = ?, subject = ?, deadline = ? where id = ?;"
            );
            stm.setString(1, activity.getTitle());
            stm.setString(2, activity.getDescription());
            stm.setString(3, activity.getTeacher());
            stm.setString(4, activity.getSubject());
            stm.setDate(5, activity.getDeadline());
            stm.setInt(6, activity.getId());
            
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ActivityDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int delete(int id){
        Connection connection = DaoConnection.getConnection();
        try {
            PreparedStatement stm = connection.prepareStatement(
                "delete from activities where id = ?;"
            );
            stm.setInt(1, id);
            
            return stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ActivityDao.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
}
