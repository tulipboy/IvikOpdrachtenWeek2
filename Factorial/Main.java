
package OpdrachtenWeek2.Factorial;

import java.util.Scanner;

public class Main {
    
     public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Geef een positief getal voor de Factorial: ");
        int jj = Integer.parseInt(reader.nextLine());
        System.out.println("het factorial getal is: " + Factorial.factorial(jj));
        
    }
}
