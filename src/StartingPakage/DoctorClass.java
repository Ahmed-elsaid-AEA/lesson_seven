/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StartingPakage;

import Model.DoctorData;
import java.util.Scanner;

/**
 *
 * @author A.E.A
 */
public class DoctorClass {

    static Scanner input;

    public DoctorClass() {
        input = new Scanner(System.in);
    }

    public static DoctorData dataDoctor() {
        System.out.println("Enter Your name : ");
        String name = input.nextLine();
        System.out.println("Enter Your subject : ");
        String subject = input.nextLine();
        System.out.println("Enter Your age : ");
        double age = input.nextDouble();
        DoctorData m=new DoctorData(name, age, subject);
        return m;
    }

}
