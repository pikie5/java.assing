

//create class discount

public class Discount {

    // Method to calculate discount based on the amount
    public static double getDiscount(double amount) 
        double discount =0.0; //initialise discount
        //call if statement
        if (amount > 5000) {
            discount = amount * 0.10;//>5000 discount=10%
        } else if (amount > 1000 && amount <=5000) {
            discount = amount * 0.05;//>1000 & <=5000 discount=5%
        } 
        return discount;

        double discount = 0.0; // Initialize discount to 0.0

        // Check if the amount is greater than 5000
        if (amount > 5000) {
            discount = amount * 0.10; // Calculate 10% discount
        } else if (amount > 1000) { // Check if the amount is between 1000 and 5000 
            discount = amount * 0.05; // Calculate 5% discount
        }

        return discount; // Return the calculated discount

    }
        //call the funtion
    public static void main(String[] args) {
double discount;
discount = getDiscount(7000);//let salary=7000
System.out.println(discount);

        double discount;
        // Call the getDiscount method 
        discount = getDiscount(7000);
        // Print the calculated discount
        System.out.println(discount);

    }
}
