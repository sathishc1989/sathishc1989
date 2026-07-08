package encapsulation;

public class LibraryMain {

            public static void main(String[] args) {


            Library L=new Library();
            L.bookname("Bible");
            L.authorname("pop");
            L.bookID(007);
            L.numberofcopies(3);


            System.out.println("Book Name : "+L.getbookname());
            System.out.println("authorname : "+ L.getauthorname());
                System.out.println("bookID : "+ L.getbookID());
                System.out.println("numberofcopies : "+ L.getnumberofcopies());
        }
    }

