import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter digit");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int sum=0;
        for (int i = 1; i < c; i++) {
            if (c%i==0){
                sum=sum+i;
            }
        }
        if (sum==c){
            System.out.println("PErfect");
        }else {
            System.out.println("No");
        }
    }
}