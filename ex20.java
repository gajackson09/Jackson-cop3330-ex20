/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

 //this program creates a tax calculator that handles multiple states and multiple counties within each state
import java.util.Scanner;
class ex20{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //declaring variables
    int qty;
    double total = 0.0, tax = 0.0;

        //asks the user input
        System.out.print("What is order amount? ");
            qty = input.nextInt();
        System.out.print("What state do you live in? ");
            String state = input.next();
        if(state.equals("Wisconsin")){
            System.out.print("What country do you live in? ");
             String county = input.next();
            if(county.equals("EauClaire")){
                tax = (qty*5.005)/100;
                total = tax + qty;
            }
            else if(county.equals("Dunn")){
                tax = (qty*5.004)/100;
                total = tax + qty; 
            }
            else{
                System.out.println("Plese enter correct country");
            }
        }
        else if(state.equals("Illinois")){
            tax = (qty*8)/100;
            total = tax + qty;
        }
        else{
            tax = 0.0;
            total = qty;
        }//end of all if else statements

        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",total));
    }//end of main
}//end of class