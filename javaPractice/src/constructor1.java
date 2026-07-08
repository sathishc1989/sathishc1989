public class constructor1 {
    int age = 27;


 constructor1( String name, int age)
 {
     System.out.println(name);
     System.out.println(age);
 }
constructor1(int age, String name)
{
    System.out.println(name);
    System.out.println(age);
}
 /*void display()
 {
     System.out.println("method name");
 } */

    public static void main(String[] args) {

     constructor1 c1 = new constructor1( "sathish", 38);

     constructor1 c2 = new constructor1(3, "vinisha");
    /* c1.display();
     c2.display();*/
    }
}