package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //variable declarations
        double wisconsinTax = 0.05; //tax for wisconsin residents
        double illinoisTax = 0.08; //tax for illinois residents
        double eauClaireTax = 0.005; //extra taxes for wisconsin residents that live in eau claire county
        double dunnTax = 0.004; //extra taxes for wisconsin residents that live in dunn county
        String wisconsin = "Wisconsin"; //wisconsin state
        String illinois = "Illinois"; //illinois state
        String eauClaire = "Eau Claire"; //wisconsin county named eau claire
        String dunn = "Dunn"; //wisconsin county named dunn

        System.out.println("\nWhat is the order amount? "); //ask the user for the order amount
        Scanner orderAmountInput = new Scanner(System.in); //scan for the order amount
        double orderAmount = orderAmountInput.nextDouble();

        System.out.println("\nWhat state do you live in (e.g. FL, WI, PA)? "); //ask the user for which state
        Scanner stateInput = new Scanner(System.in); //scan for the state
        String state = stateInput.next();

        System.out.println("\nWhat county do you live in (e.g. Eau Claire, Dunn, Dane)? "); //ask the user for which county
        Scanner countyInput = new Scanner(System.in); //scan for the state
        String county = countyInput.next();

        double taxAmount = 0; //the amount of taxes that will be added to the total cost in the end

        if (state.equals(wisconsin)) { //if the user is a resident of Wisconsin
            taxAmount = orderAmount * wisconsinTax; //if so, then a new taxAmount is calculated
            double totalCost = orderAmount + taxAmount; //calculate the total cost

            if (county.equals(eauClaire)) {

            }
            else if (county.)

            //output the subtotal, tax, and total cost
            System.out.println("\nThe tax is $" + String.format("%.2f", taxAmount) + ".\n" + "The total is $" + String.format("%.2f", totalCost) + ".");

        }
        else if (state.equals(illinois)){ //if the user isn't a resident of Wisconsin
            taxAmount = orderAmount * illinoisTax; //if so, then a new taxAmount is calculated
            double totalCost = orderAmount + taxAmount; //calculate the total cost

            //output the total cost
            System.out.println("\nThe tax is $" + String.format("%.2f", taxAmount) + ".\n" + "The total is $" + String.format("%.2f", totalCost) + ".");
        }
        else {
            double totalCost = orderAmount + taxAmount; //calculate the total cost

            //output the total cost
            System.out.println("\nThe tax is $" + String.format("%.2f", taxAmount) + ".\n" + "The total is $" + String.format("%.2f", totalCost) + ".");
        }
    }
}