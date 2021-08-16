
import java.util.Scanner;

class BankOperation
{
    static int pin = 1234;
    static int availableBalance = 5000;

    static
    {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("SELECT YOUR LANGUNAGE");
        System.out.println("1: ENGLISH\n2: HINDI");
        int choice = sc1.nextInt();

        if(choice==1)
        {
            System.out.println("YOUR SELECTED LANGUAGE IS ENGLISH");
        }
        else if(choice==2)
        {
            System.out.println("YOUR SELECTED LANGUAGE IS HINDI");
        }
        else
        {
            System.out.println("INVALID CHOICE");
            System.exit(0);                             /// terminate program 
        }
    }

    // static
    // {
    //     pin = 1234;
    // }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BankOperation b1 = new BankOperation();

        System.out.println("ENTER PIN");
        int pin = sc.nextInt();

        if(pin==1234)
        {
            System.out.println("SELECT OPERATION");
            System.out.println("1: WITHDRWA\n2: CHECK BALANCE\n3: CHNAGE PIN");
            int ch = sc.nextInt();
            
            if(ch==1)
            {
                System.out.println("ENTER AMOUNT");
                double amt = sc.nextDouble();

                b1.withDraw(amt);
            }
            else if(ch==2)
            {
                b1.checkBalance();
            }
            else if(ch==3)
            {
                System.out.println("ENTER NEW PIN");
                int newPin = sc.nextInt();
                b1.changePin(newPin);
            }
            else
            {
                System.out.println("INVALID CHOICE");
            }
        }
        else 
        {
            System.out.println("WRONG PASSWORD");
        }
    }

        void withDraw (double amt )
        {
            if(amt<=5000)
            {
                availableBalance -= availableBalance;
                System.out.println(amt+" AMOUNT DEBITED FROM YOUR ACCOUNT");
            }
            else
            {
                System.out.println("INSUFFICIENT ACCOUNT BALANCE");
            }
        }
        void checkBalance()
        {
            System.out.println("AVAILABLE ACCOUNT BALANCE IS "+availableBalance);
        }
        void changePin(int newPin)
        {
            pin = newPin;
            System.out.println("PIN CHNAGED SUCCESSFULLY");
        }
}