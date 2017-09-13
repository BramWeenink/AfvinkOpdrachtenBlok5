/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsthelloworld;

import java.util.Scanner;

/**
 *
 * @author BramWeenink
 */
public class Student {
    
    public String Naam;
    public int StudentNummer;
    Scanner user_input = new Scanner( System.in );
    
    
    public void setNaam(){
        System.out.print("Voer naam in.");
        Naam = user_input.nextLine();
    }
    
    public String getNaam(){
        return Naam;
    }
    
    public void setStudentNummer(){
        System.out.print("Voer student nummer in.");
        StudentNummer = user_input.nextInt();
    }
    
    public int getStudentNummer(){
        return StudentNummer;
    }
}
