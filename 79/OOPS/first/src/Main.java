import java.util.Scanner;
import java.lang.Math;


class arm{
    public  boolean test(int n){
        int t=String.valueOf(n).length();
        int nn=n;
        int ch=0;
        for (int i=0;i<t;i++){
            ch= (int) (Math.pow(nn%10,3)+ch);
            nn=nn/10;
        }
        if (ch==n){
            return true;
        }else {
            return false;
        }
    }


}
public class Main {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            int n;
            n=sc.nextInt();
            arm armsa=new arm();
        System.out.println(armsa.test(n));





    }
}
