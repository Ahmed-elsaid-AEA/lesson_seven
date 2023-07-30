/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author A.E.A
 */
public class DoctorData {

    //variable private
    //constructor
    //getter setter
    private String name;
    private double age;
    private String subject; 

   
     public  DoctorData() {
         
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}
