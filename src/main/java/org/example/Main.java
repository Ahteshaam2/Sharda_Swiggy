package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (!validateCredentials()) {
            System.out.println("Invalid username or password. Exiting...");
            return;
        }
        else{

            System.out.println("Welcome to Sharda Swiggy Delivery App Mr. Ahteshaam");


            // Display menu options
            Scanner scanner = new Scanner(System.in);
            System.out.println("Available Restaurants Choose from which you wanna enter");
            Restro.displayMenu("A:\\papers\\Restro.csv");
            int restro = scanner.nextInt();


            System.out.println("following are the available Dishes in your chosen restro");
            Dish.displayMenu("A:\\papers\\menu1.csv");


            scanner.close();
        }
    }

    private static boolean validateCredentials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scanner.nextLine();

        System.out.println("Enter your password:");
        String password = scanner.nextLine();

        // Perform username and password validation
        if (username.equals("Ahateshaam") && password.equals("Alex")) {
            return true;
        } else {
            return false;
        }
    }
}