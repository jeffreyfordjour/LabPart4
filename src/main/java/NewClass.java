
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author frys
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter today's sales for store 1:");
        double storeOne = keyboard.nextDouble()/100;
        String starsOne = "";
        for (int i=1; i<=storeOne ; i++) {
            starsOne += "*";
        }
        System.out.println("Enter today's sales for store 2:");
        double storeTwo = keyboard.nextDouble()/100;
        String starsTwo = "";
        for (int i=1; i<=storeTwo ; i++) {
            starsTwo += "*";
        }
        
        System.out.println("Enter today's sales for store 3:");
        double storeThree = keyboard.nextDouble()/100;
        String starsThree = "";
        for (int i=1; i<=storeThree ; i++) {
            starsThree += "*";
        }
        
        System.out.println("Enter today's sales for store 4:");
        double storeFour = keyboard.nextDouble()/100;
        String starsFour = "";
        for (int i=1; i<=storeFour ; i++) {
            starsFour += "*";
        }
        
        System.out.println("Enter today's sales for store 5:");
        double storeFive = keyboard.nextDouble()/100;
        String starsFive = "";
        for (int i=1; i<=storeFive ; i++) {
            starsFive += "*";
        }
        System.out.println("SALES BAR CHART");
        System.out.println("Store 1: "+ starsOne);
        System.out.println("Store 1: "+ starsTwo);
        System.out.println("Store 1: "+ starsThree);
        System.out.println("Store 1: "+ starsFour);
        System.out.println("Store 1: "+ starsFive);
        
        
    }
}
