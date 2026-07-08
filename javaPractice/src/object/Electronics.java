package object;

public class Electronics {
    static String companyname;
    static double price;
    static String colour;

    void laptop1(String companyname, double price, String colour) {
        companyname = companyname;
        price = price;
        colour = colour;
        System.out.println("Laptop company name is:" + companyname);
        System.out.println("Laptop company price is:" + price);
        System.out.println("Laptop company colour is:" + colour);
    }

    void laptop2(String companyname, double price, String colour) {
        companyname = companyname;
        price = price;
        colour = colour;
        System.out.println("Laptop company name is:" + companyname);
        System.out.println("Laptop company price is:" + price);
        System.out.println("Laptop company colour is:" + colour);
    }

    public void applemobile(String name, String colour, double price) {
        companyname = name;
        colour = colour;
        price = price;
        System.out.println("mobile  name is:" + name);
        System.out.println("mobile  colour is:" + colour);
        System.out.println("mobile  price is:" + price);


    }

    public void samsungmobile(String name, String colour, double price) {
        companyname = name;
        colour = colour;
        price = price;
        System.out.println("mobile  name is:" + name);
        System.out.println("mobile  colour is:" + colour);
        System.out.println("mobile  price is:" + price);


    }

    public static void main(String[] args) {

        Electronics elec = new Electronics();
        elec.laptop1("dell", 65000, "black");
        System.out.println("=============================");
        elec.laptop2("hp", 95000, "white");
        System.out.println("===============================");

        Electronics mobile = new Electronics();
        mobile.samsungmobile("samsung", "black", 20000);
        System.out.println("========================================");
        mobile.applemobile("apple", "black", 90000);
        System.out.println("========================================");
    }
}



