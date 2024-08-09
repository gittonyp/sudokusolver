import java.util.BitSet;
import java.util.Scanner;

public class Main {
    static int sum=0;
    static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum=sum+arr[i];
        }
        System.out.println();
    }
    static void printrev(int arr[]){
        for (int i = arr.length-1; i <=0 ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void printsum(){

        System.out.println(sum);
    }
    static void dublicates(int arr[]){
        BitSet bitSet = new BitSet();
        for (int i = 0; i < arr.length; i++) {
            bitSet.set(arr[i]);
        }

        System.out.println(bitSet);
    }
    static void newarr(int arr[]){
       int arr2[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[i];
        }
        print(arr2);


    }
    public static void main(String[] args) {

        int n;

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        dublicates(a);

    }
}