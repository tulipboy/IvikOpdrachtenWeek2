
package OpdrachtenWeek2.Factorial;

import java.util.Scanner;

public class Factorial {
        public static int factorial(int jj){
        int antwoord = 1;
        for (int kk = 1 ; kk <= jj; kk++){
            antwoord = antwoord * kk;
        }
        return antwoord;
    }
}