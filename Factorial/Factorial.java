/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpdrachtenWeek2.Factorial;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Factorial {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Geef een getal voor de Factorial: ");
        int jj = Integer.parseInt(reader.nextLine());
        int antwoord = 1;
        if (jj < 0){
            System.out.println("Helaas het door u gekozen nummer rekenen wij niet goed.");
        }
             
        for (int kk = 1 ; kk <= jj; kk++){
            antwoord = antwoord * kk;
        
        }
        // hier is mijn code niet meer zo mooi.
        // Ik wist helaas niet meer op een verantwoorde manier deze laatste zin
        // weg te laten bij een antwoord met een negatieve waarde.
        if (jj > 0){
        System.out.println("het factorial getal is: " + antwoord);
    }
    }
}
