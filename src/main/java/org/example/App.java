/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sabrina Lopez
 */

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

        System.out.println("\nWhat state do you live in (e.g. Wisconsin, Florida, Illinois)? "); //ask the user for which state
        Scanner stateInput = new Scanner(System.in); //scan for the state
        String state = stateInput.next();

        double taxAmount = 0; //the amount of taxes that will be added to the total cost in the end

        if (state.equals(wisconsin)) { //if the user is a resident of Wisconsin

            System.out.println("\nWhat county do you live in (e.g. Eau Claire, Dunn, Dane)? "); //ask the user for which county
            Scanner countyInput = new Scanner(System.in); //scan for the state
            String county = countyInput.nextLine();

            if (county.equals(eauClaire)) { //if the wisconsin resident lives in eau claire county
                taxAmount = orderAmount * (wisconsinTax + eauClaireTax); //if so, then a new taxAmount is calculated
            }
            else if (county.equals(dunn)) { //if the wisconsin resident lives in dunn county
                taxAmount = orderAmount * (wisconsinTax + dunnTax); //if so, then a new taxAmount is calculated
            }
            else { //if the wisconsin resident doesn't live in eau clair or dunn county
                taxAmount = orderAmount * wisconsinTax; //if so, then a new taxAmount is calculated
            }

            double totalCost = orderAmount + taxAmount; //calculate the total cost

            //output the total cost
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