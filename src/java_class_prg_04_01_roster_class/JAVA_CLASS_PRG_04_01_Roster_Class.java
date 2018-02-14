/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_class_prg_04_01_roster_class;

import java.util.Scanner;
/**
 *
 * @author kbsmith01
 */
public class JAVA_CLASS_PRG_04_01_Roster_Class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        Roster roster = new Roster();
        
        String temp = new String();
        
        System.out.print("Enter a name: ");
        temp = keyboard.nextLine();
        
        if(roster.isNamePresent(temp)) {
            System.out.println("That name is already present");
        }
        else {
            roster.addName(temp);
        }
        
        System.out.print("Enter a name: ");
        temp = keyboard.nextLine();
        
        if(roster.isNamePresent(temp)) {
            System.out.println("That name is already present");
        }
        else {
            roster.addName(temp);
        }
    }
    
}
