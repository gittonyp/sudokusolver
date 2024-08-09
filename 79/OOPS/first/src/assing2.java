import java.util.Scanner;

class City
{
    int population;
    String name;
    public void info(){
        Scanner sc=new Scanner(System.in);
        System.out.println("City Name is ");
        name=sc.nextLine();
        System.out.println("Population is ");
        population=sc.nextInt();
    }
    public void print(){
        System.out.println("City Name is "+name);
        System.out.println("population is "+population);
    }
}
public class assing2 {
    public static void main(String[] args) {

        City[] cities =new City[5];
        for (int i=0;i<5;i++){
            cities[i]=new City();
            cities[i].info();
        }
        for (int i=0;i<5;i++){
            cities[i].print();
        }


    }
}
