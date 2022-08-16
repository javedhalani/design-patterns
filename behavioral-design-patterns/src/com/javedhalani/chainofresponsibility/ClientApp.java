package com.javedhalani.chainofresponsibility;

import java.util.Scanner;

public class ClientApp {

    public static void main(String[] args) {

        ATMDispenser atmDispenser = new ATMDispenser();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to withdraw in multiples of 100");
            Scanner in = new Scanner(System.in);
            amount = in.nextInt();
            if (amount % 100 != 0) {
                System.out.println("Amount should be multiple of 100 ");
                break;
            }
            // process request
            atmDispenser.dispens(new Currency(amount));
        }
    }
}
