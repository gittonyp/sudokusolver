import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter salary");
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        System.out.println("Gross Salary "+sal*1.35);
        System.out.println("Net Salary "+sal*1.1475);



    }
}