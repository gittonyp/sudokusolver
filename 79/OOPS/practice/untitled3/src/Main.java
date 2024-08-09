import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter digit");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        String cc=String.valueOf(c);

        int pp=c*c;
        String a=String.valueOf(pp);
        if (a[a.length()-1]==cc[1] && a[a.length()-2]==c[0]){
            System.out.println("YES");
        }else{
            System.out.println("Not");
        }
    }
}