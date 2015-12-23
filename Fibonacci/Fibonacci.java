/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpdrachtenWeek2.Fibonacci;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Geef het aantal voor de Fibonacci: ");
        int jj = Integer.parseInt(reader.nextLine());
        int kk;
        int aantal = 1;
        int mm =1;
        int pp =0;
        while (aantal <= jj){
            kk = mm + pp;
            System.out.print(kk);
            pp = mm;
            mm = kk;
            
            aantal++;
        }
        System.out.println("");
    }
    /* ik snap niet precies hoe hij werkt aangezien jij aangaf dat hij eerst 
     moest beginnen met 0,1,1,2,3,5,8
     graag daar iets meer duidelijkheid over zodat ik de code kan aanpassen.
     hetgeen ik niet snap is de uitleg die jij gaf over:
     0,1,1,2,3,5,8,13,21,..
     ( 0 +1 = 1, 1+1=2,1+2=3,2+3=5,3+5=8,5+8=13,8+13=21….)
     moet ik nu de eerste of de tweede regel volgen in deze code?
     alvast bedankt voor de verduidelijking
     en nog hele fijne kerstdagen!
    */
    
}
