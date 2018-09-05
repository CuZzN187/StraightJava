/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation02;
import java.util.Scanner;

/**
 *
 * @author cuzzn
 */
public class Operation02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scnr = new Scanner(System.in);
        
        //variables
        String birthMonth = null;
        int date = 0;
        int year = 0;
        
        try
        {  
            //Retrieve information from user
            System.out.print("Enter the month you were born: ");
            birthMonth = scnr.nextLine();
            System.out.print("Enter the day you were born: ");
            date = scnr.nextInt();
            System.out.print("Enter the year you were born: ");
            year = scnr.nextInt();
            
            //calculate retirement age
            year = year + 67;
                    
            System.out.println("You will retire on "+birthMonth+" "+date+", "+year);
        }
        catch(Exception e)
        {
            System.out.println("Error!");
        }
    }
    
}
