public class TotalWithTax {

    public static void main(String[] args)
    {
        //Declare the variables and the constant.
        final double taxture = 0.0825;
        double price = 52.75;
        double tax = price*taxture;
        double finalprice = price + tax;
        System.out.println("Price: "+ price + "\n" + "Sales Tex: " + tax + "\n" + "Total: "+ finalprice);
        //Make the calculations and assign
        //the results to the appropriate variables.
        //Print the results.
    }
}
