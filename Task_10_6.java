package programs;

import java.util.Scanner;

public class PasswordExceptionHandling {
	
	public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter a Username");
        String Username = s1.toString();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Please enter a Password");
        String Password = s2.toString();
        
        try {
            String Password1 = "Abdhul";
            System.out.println("Welcome");
        } catch (ArithmeticException e) {
            System.out.println("Please enter the correct Password");
        }

        System.out.println("This statement is outside try-catch blocks.");
    }
}

