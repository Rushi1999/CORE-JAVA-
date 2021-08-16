import java.util.Scanner;
class Electricity
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER YOUR BILL AMOUNT");
       double amount = sc.nextDouble();

        if(amount<=300)
        {
            bill(amount);
        }
        else if( amount>=300 && amount<550)
        {
            bill2(amount);  
        }
        else 
        {
            bill3(amount);
        }
        // else
        // {
        //     System.out.println("VALUE NOT MATCH");
        // }

        
        
        
    }
    static void bill(double amount)
    {
         double unit = 3.5;
         double total = amount * unit;

        System.out.println("YOUR BILL AMOUNT IS: "+total);
    }
    static void bill2(double amount)
    {
        double unit = 7;
         double total = amount * unit;

        System.out.println("YOUR BILL AMOUNT IS: "+total);
    }
    static void bill3(double amount)
    {
        double unit = 11;
         double total = amount * unit;

        System.out.println("YOUR BILL AMOUNT IS: "+total);
    }

}