/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author GuilhermeFCM
 */
public class Activity {
    private int id;
    private String title, description, teacher, subject;
    private Date deadline;

    public Activity(int id, String title, String description, String teacher, String subject, Date deadline) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.subject = subject;
        this.deadline = deadline;
    }

    public Activity(String title, String description, String teacher, String subject, Date deadline) {
        this.title = title;
        this.description = description;
        this.teacher = teacher;
        this.subject = subject;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    
}
