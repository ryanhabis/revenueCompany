/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author ryanh
 */
public class ifExercise1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How much money did we make this year: ");
        double money = scanner.nextDouble();
        
        System.out.println("How much revenue did we make this year:");
        double revenue = scanner.nextDouble();
        
        if(money <= revenue)
        {
            System.out.println("We are losing money.");

        }
        else
        {
            System.out.println("The company is doing ok.");
        }
    }
}
