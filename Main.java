package murach.ui;

import java.text.NumberFormat;
import murach.calculators.Financial;

//Code worked on by Paul Bahdouchi
//10/31/2017
//Java programming with Micky Badgero

public class Main {

    public static void main(String[] args) {
        
        //create a string array with ten rows and four columns
        String tenfour [][] = new String [10][4];
        //create an integer variable called rowcounter for counting
        int rowcounter = 0;
        
        
        // displayLine a welcome message
        Console.displayLine("Welcome to the Future Value Calculator");
        Console.displayLine();

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            // get input from user
            double monthlyInvestment = 
                    Console.getDouble("Enter monthly investment:   ");
            double yearlyInterestRate = 
                    Console.getDouble("Enter yearly interest rate: ");            
            int years = 
                    Console.getInt("Enter number of years:      ");
            
            // call the future value method
            double futureValue = Financial.calculateFutureValue(
                    monthlyInvestment, yearlyInterestRate, years);

            // format and displayLine the result
            Console.displayLine("Future value:               " + 
                    NumberFormat.getCurrencyInstance().format(futureValue));
            Console.displayLine();
            
             // format the currency and percent
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            
            NumberFormat percent = NumberFormat.getPercentInstance();
            
            percent.setMinimumFractionDigits(1);

            // format the values and store them in the array
            tenfour[rowcounter][0] = currency.format(monthlyInvestment);
            
            tenfour[rowcounter][1] = percent.format(yearlyInterestRate / 100);
            
            tenfour[rowcounter][2] = Integer.toString(years);
            
            tenfour[rowcounter][3] = currency.format(futureValue);

            // increment the row counter
            rowcounter++;
                    
            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();    
        }
        
        //print out the array
        //print the title
        Console.displayLine("Future Value Calculations");
        //print out blank space
        Console.displayLine();
        //print out the row names
        Console.displayLine("Inv/Mo.\tRate\tYears\tFuture Value");
        //set up a nested for loop to print out all the data
        for (int i = 0; i < rowcounter; i++) {
            //assign the data to a variable
            String message = "";
            for (int k = 0; k < 4; k++) {
                message += tenfour[i][k] + "\t";
            }
            Console.displayLine(message);
        }
        Console.displayLine();
            
        //print out a goodbye to the user
        Console.displayLine("Bye!");
    }
}