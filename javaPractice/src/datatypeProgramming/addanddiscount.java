package datatypeProgramming;

public class addanddiscount {
    public static void main(String[] args) {
        double one = 2222.22;
        double two = 1111.10;
        double three = 1000.00;
        double Amount = one + two + three;
        double Discount =  Amount - Amount*0.1;

        System.out.println("Amount:" +Amount);
        System.out.println("Discount:" +Discount);
    }
}
