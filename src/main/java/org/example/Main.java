package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Sharda Swiggy");
        System.out.println("Today's Special");
        info("A:/papers/menu.csv");
        Scanner sc=new Scanner(System.in);
        System.out.println("Select your Dish:");
        String dish=sc.nextLine();
        if (dish.equalsIgnoreCase("Dal Makhni")){
            System.out.println("Here's the List of Some Famous Restaurants:");
            info("A:/papers/rest_c.csv");
        }else if(dish.equalsIgnoreCase("Butter Chicken")){
            info("A:/papers/rest_d.csv");
        }
        System.out.println("Select the Restaurant");
        String res=sc.nextLine();
        System.out.println("Enter the Payment Mode-");
        System.out.println("1. Google Pay\n2. Paytm\n3. PayPal");
        String pay=sc.nextLine();
        System.out.println("Your Payment is being Processed");

        System.out.println("Your Order is being Placed");

        System.out.println("Your order will be ready in 20 minutes");

    }
    private static void info(String filePath) {
        String line="";
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filePath));
            while((line =reader.readLine())!= null){
                String[] row=line.split(",");
                for (String i: row){
                    System.out.printf("%-30s",i);
                }
                System.out.println();
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}