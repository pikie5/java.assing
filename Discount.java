
//create class discount
public class Discount {

    public static double getDiscount(double amount) {
        double discount =0.0; //initialise discount
        //call if statement
        if (amount > 5000) {
            discount = amount * 0.10;//>5000 discount=10%
        } else if (amount > 1000 && amount <=5000) {
            discount = amount * 0.05;//>1000 & <=5000 discount=5%
        } 
        return discount;
    }
        //call the funtion
    public static void main(String[] args) {
double discount;
discount = getDiscount(7000);//let salary=7000
System.out.println(discount);
    }
}
