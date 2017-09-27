/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afvink3;

/**
 *
 * @author BramWeenink
 */
import java.util.Scanner;


public class Student{
    
    public String Naam;
    public int StudentNummer;
    Scanner user_input = new Scanner( System.in );
    
    
    public void setNaam(){
        System.out.print("Voer naam in.");
        this.Naam = user_input.nextLine();
    }
    
    public String getNaam(){
        return Naam;
    }
    
    public void setStudentNummer(){
        System.out.print("Voer student nummer in.");
        this.StudentNummer = user_input.nextInt();
    }
    
    public int getStudentNummer(){
        return StudentNummer;
    }
    public Student (String n, int l){
        StudentNummer = l;
        Naam = n;
    }
    public Student (String n){
        Naam = n;
    }
    
//    public void info(){
//        System.out.print("Dit is de Student: "+Naam+" En dit is de Studentnummer"+StudentNummer);
//    }
    
}

    

