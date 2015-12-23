/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpdrachtenWeek2.Reverse;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Reverse {
     
     
     public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
         System.out.println("geef hier een zin die omgedraaid wordt: ");
         String zin = reader.nextLine();
         
         
         int i = zin.length()-1;
         String antwoord = "";
         int k = 0;
         for (int jj = 0 ; jj <= i; jj++){
             antwoord = antwoord + zin.charAt(i-k);
             k++;
         }
         System.out.println(antwoord);
    }
    
    
}

