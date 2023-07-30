/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingPakage;

import Model.DoctorData;

/**
 *
 * @author A.E.A
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DoctorClass doctor = new DoctorClass();
        DoctorData doctorData = doctor.dataDoctor();
        System.out.println("name :" + doctorData.getName()
                + ",age : " + doctorData.getAge() + " ,subject :" + doctorData.getSubject());
    }
}
