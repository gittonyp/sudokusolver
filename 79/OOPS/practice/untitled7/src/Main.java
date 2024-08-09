import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAtrix mul");
        int a[][];
        int b[][];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2");
        int n=sc.nextInt();
        int t= sc.nextInt();
        a=new int[n][t];
        System.out.println("Enter 2");
        int nn=sc.nextInt();
        int tt= sc.nextInt();
        b=new int[nn][tt];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < t; j++) {
                System.out.println("Enter "+i+" "+j);
                a[i][j]= sc.nextInt();
            }
        }
        for (int i = 0; i < nn; i++) {
            for (int j = 0; j < tt; j++) {
                System.out.println("Enter "+i+" "+j);
                b[i][j]= sc.nextInt();
            }
        }
        int arr[][]=new int[n][tt];
        if (t!=nn){
            System.out.println("Multilication is not possible");
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tt; j++) {
                int pr=0;
                for (int k = 0; k < t; k++) {
                    pr=a[i][k]*b[k][j]+pr;
                }
                arr[i][j]=pr;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < tt; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}