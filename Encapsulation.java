import java.util.Scanner;
class A{
    private int pass;
    private double bal = 3453;
    public double money;
    
    public void Deposit(){
        System.out.println("Enter the password");
        Scanner sc = new Scanner(System.in);
        pass = sc.nextInt();
        if(pass==5609)
        {
            System.out.println("Enter the money u want to deposit");
           
            money=sc.nextInt();
            bal= bal+money;
            System.out.println("Total balance is "+bal);
        }
        else{
            System.out.println("Incorrect password");
        }
    }

        public void Withdraw(){
            System.out.println("Enter the password");
            Scanner sc = new Scanner(System.in);
            pass = sc.nextInt();
            if(pass==5609)
            {
                System.out.println("Enter the money u want to withdraw");
                
                money=sc.nextInt();
                bal= bal-money;
                System.out.println("Total balance is "+bal);
            }
            else{
                System.out.println("Incorrect password");
            }
    }
    public void checkbalance(){
        System.out.println("Enter the password");
        Scanner sc = new Scanner(System.in);
        pass = sc.nextInt();
        if(pass==5609)
        {
           
            System.out.println("Total balance is "+bal);
        }
        else{
            System.out.println("Incorrect password");
        }
    }
}

    class Customer{
        public static void main(String[] args) {
            A r = new A();
            int ch;
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.checkbalance");
            System.out.println("Enter your choice");
            Scanner sc = new Scanner(System.in);
            ch = sc.nextInt();
            switch(ch)
            {
                case 1 : r.Deposit();
                break;
                case 2 : r.Withdraw();
                break;
                case 3 : r.checkbalance();
                break;
                default :  System.out.println("Invalid option");
            }
            
            
        }
    }




    

