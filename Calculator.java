package Unit_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner keyb = new Scanner(System.in);
        
        System.out.print("Please enter the first number that you wish to get added, subtracted, multiplied, or divided: ");
        double number_one = keyb.nextDouble();
        
        System.out.print("Please enter the second number: ");
        double number_two = keyb.nextDouble();
        
        System.out.print("Please enter the operation you wish to perform on the two numbers. + is addition, - is subtraction, * is multiplication, / is division: ");
        String operation = keyb.next();
            
        if (operation.equals("+")){
            double calculated_num = number_one + number_two;
            System.out.print ("The sum of " + number_one + " plus " + number_two + " is " + calculated_num);
        }  
        else if (operation.equals("-")){
            double calculated_num = number_one - number_two; 
            System.out.print ("The difference between " + number_one + " and " + number_two + " will be " + calculated_num);
        }
        else if (operation.equals("*")){
            double calculated_num = number_one * number_two;
            System.out.print ("Therefore, " + number_one + " multiplied by " + number_two + " is " + calculated_num);
        }
        else if (operation.equals("/")){
            double calculated_num = number_one/number_two;
            System.out.print ("Therefore, the quotient of " + number_one + " divided by " + number_two + " is " + calculated_num);
        }
        else{
            System.out.print ("You have answered something invalid. Please choose +, -, *, /. Those are the 4 operations. ");
        }
    }    
}
