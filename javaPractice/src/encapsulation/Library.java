package encapsulation;

import javax.swing.*;

public class Library {

    private String bookname;

      private String authorname;

      private int bookID;

      private int numberofcopies = 5;


    public void bookname(String bookname )
    {
        this.bookname=bookname;


    }

    public void authorname(String authorname )
    {
        this.authorname=authorname;


    }
    public void bookID(int bookID)
    {
        this.bookID=bookID;


    }

    public void numberofcopies(int numberofcopies )
    {
        this.numberofcopies=numberofcopies;


    }
    public String getbookname()
    {

        return bookname;
    }

    public String getauthorname()
    {

        return authorname;
    }
    public int getbookID()
    {

        return bookID;
    }
    public int getnumberofcopies()
    {

        return numberofcopies;
    }

    void checkavailability()
    {
        if (numberofcopies > 0)
        {
            System.out.println("Book Available");

        }
        else {
            System.out.println("Book not Available");
        }
    }

}
