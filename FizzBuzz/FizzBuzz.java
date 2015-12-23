/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpdrachtenWeek2.FizzBuzz;

/**
 *
 * @author Admin
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for(int i = 1; i < 100; i++){
            if (i % 5 == 0 && i % 3 == 0){
                i++;
                System.out.println("FizzBuzz");
            }
            
            if (i % 5 == 0){
                i++;
                System.out.println("Buzz");
            }
            
            if (i % 3 == 0){
                i++;
                System.out.println("Fizz");
            }
            System.out.println(i);
        }
    }
}
