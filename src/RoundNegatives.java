import java.util.Scanner;

public class RoundNegatives {

    public static void main(String[] args)
    {
        // Create a Scanner object and write a prompt for the user to enter a number
     Scanner scan = new Scanner(System.in);
     System.out.println("type a number");
     double number = scan.nextDouble();
     int answer = (int)(number-0.5);
     System.out.println(number+"rounded to a whole number is "+answer);
        // Declare a variable of the correct type that will receive the input from the user.

        // Declare an variable and write an expression to round the user input
        // ex. int roundedNum=/*expression to round a negative value*/;

        // Write a statement that will output the result in the form below.
        // ex. -3.21 rounded to a whole number is -3

    }
}
