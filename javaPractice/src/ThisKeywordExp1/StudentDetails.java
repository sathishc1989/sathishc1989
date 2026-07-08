package ThisKeywordExp1;

class studentDetails
{
    String name;
    int age;

public void studentDetails( String name, int age)
{
    this.name = name;
    this.age = age;

}
void display()
{
    System.out.println("sathish");
    System.out.println("18");
}

public static void main(String[] args) {
    studentDetails stu = new studentDetails();
    stu.display();
}
}