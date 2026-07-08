package datatypeProgramming;

//Write a program to store employee name,basic salary and pf amount.
//calculate net employeesalary.
//After calculation increment basic salary by 15% and finally employee salary with
// and without Incrementation

public class empsdetails {
    public static void main(String[] args) {
        String employeename = "sathish";
        double basicsalary = 25000;
        double PF = basicsalary*0.1;
        double netemployeesalary = basicsalary - PF;

        System.out.println("After calculation increment basic salary by 15%:" +(netemployeesalary + basicsalary*0.15));
        System.out.println("Employee salary without increment:" +netemployeesalary);
    }
}
