package variableTypes;

public class Libraries // instance variables
{
    int bookid;
    String bookname;
    int finevalues;
    int duedays;


    // external method & non static method & parameterised
    public void Bookdetails(int bookid, String bookname) {
        System.out.println("the book name is:" + bookname);
        System.out.println("the bookid is:" + bookid);
    }

    public void Fineanddues(int finevalues, int duedays) {
        System.out.println("the fine is:" + finevalues);
        System.out.println("the due is:" + duedays);
    }

    //main method
    public static void main(String[] args) {
        Libraries lb = new Libraries();
        lb.Bookdetails(007, "bible");
        lb.Fineanddues( 100,  20);
    }
}
