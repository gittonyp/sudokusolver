import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter digit");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();


        int pp=1;
        int ss=0;
        while(c){
            int cc=c%10;
            c=c/10;
            pp=pp*cc;
            ss=ss+cc;
        }
        if (ss=pp){
            System.out.println("YEs");
        }else{
            System.out.println("Not");
        }




    }
}