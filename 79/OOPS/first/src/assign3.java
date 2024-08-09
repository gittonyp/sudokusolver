

import java.util.Scanner;

class account{
    String name;
    int acn;
    private double money=0;
    public account(int acn,String name){
        this.name=name;
        this.acn=acn;
    }
    public void deposit(double dep){
        money=dep+money;
    }
    public void print(){
        System.out.println("money "+money);
    }
    public void withdraw(double dep){
        if (dep>money){
            System.out.println("Does not have enough money");
            return;
        }
        money=money-dep;
    }
}
class bank{
    account[] acc=new account[100];
    Scanner sc=new Scanner(System.in);
    int acn=0;
    public void addacc(){
        String name=sc.nextLine();
        acc[acn]=new account(acn,name);
        acn++;
    }
    public void listall(){
        for (int i=0;i<acn;i++){
            if (acc[i].name!=null){
                System.out.println(acc[i].name+" "+acc[i].acn);
            }
        }
    }
    public void remove(){
        System.out.println("Enter account no.");
        int i=sc.nextInt();
        acc[i].name=null;

        }

    public void deposit(){
        System.out.println("Enter Account number");
        int no=sc.nextInt();
        System.out.println("Enter Ammount");
        double money= sc.nextDouble();
        for (int i = 0; i < acn; i++) {
            if (acc[i].acn==no){
                acc[i].deposit(money);
            }
        }
    }

    public void withdraw(){
        System.out.println("Enter Account number");
        int no=sc.nextInt();
        System.out.println("Enter Ammount");
        double money= sc.nextDouble();
        for (int i = 0; i < acn; i++) {
            if (acc[i].acn==no){
                acc[i].withdraw(money);
            }
        }
    }
    public void check(){
        System.out.println("Enter Account number");
        int no=sc.nextInt();
        for (int i = 0; i < acn; i++) {
            if (acc[i].acn==no){
               acc[i].print();
            }
        }
    }
}


public class assign3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        bank pccoe=new bank();
        int end=1;
        while(end==1){
            int choice;
            System.out.println("1.List All Accounts");
            System.out.println("2. Add Account");
            System.out.println("3. Remove Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Check Balance");
            System.out.println("7. Exit");
            System.out.println();
            choice=sc.nextInt();
            switch (choice){
                default:
                    System.out.println("Wrong option");
                    break;
                case 7:
                    end=0;
                    break;
                case 1:
                    pccoe.listall();
                    break;
                case 2:
                    pccoe.addacc();
                    break;
                case 3:
                    pccoe.remove();
                    break;
                case 4:
                    pccoe.deposit();
                    break;
                case 5:
                    pccoe.withdraw();
                    break;
                case 6:
                    pccoe.check();
                    break;
            }

        }
    }
}
