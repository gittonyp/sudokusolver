import java.util.Scanner;

class person
{
    int age;
    String name;
    public person(){
       Scanner sc=new Scanner(System.in);
        System.out.println("Name is ");
       name=sc.nextLine();
        System.out.println("age is ");
       age=sc.nextInt();
    }
    public person(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void print(){
        System.out.println("Name is "+name);
        System.out.println("age is "+age);
    }
}
public class assign1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.println("Name is ");

        String name=sc.nextLine();
        System.out.println("age is ");
        age= sc.nextInt();
        person p1=new person(age,name);

        person p2=new person();
        p1.print();
        p2.print();

    }
}
