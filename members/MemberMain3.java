/* CALCULATE ELECTRICITY BILL 
* SELECT TYPE OF CUSTOMER
* TAKE CURRENT AND PREVIOUS READING FROM USER
*/



import java.util.Scanner;
class Display
{
    static double residentialUnit = 4.2;
    static double commertialUnit = 5.2;

   void residential(double current,double previous)
   {
       double totalReading = current - previous;
       double total = totalReading*residentialUnit;

       System.out.println("TOTAL BILL IS: "+total);
   }
   void commertial(double current, double previous)
   {
       double totalReading = current - previous;
       double total = totalReading*commertialUnit;

       System.out.println("TOTAL BILL IS: "+total); 
   }
}
class  MemberMain3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT CUSTOMER TYPE");
        System.out.println("1: Residential\n2: Commertial");
        int ch = sc.nextInt();

        System.out.println("ENTER CURRENT READING");
        double current = sc.nextDouble();

        System.out.println("ENTER PERVIOUS READING");
        double previous = sc.nextDouble();

        if(ch==1)
        {
            new Display().residential(current,previous);
        }
        else if(ch==2)
        {
            new Display().commertial(current,previous);
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }

    }
}