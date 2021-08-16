/* 

                                            SELECT CHOICE
                                            |
                                            |-----> SELECT TYPE OF HOTEL
                                            |             |  
                                            |             |----->1: AC -->2: NON-AC
                                            |             
                                            |-----> SELECT TYPE OF MENU             
                                            |             |
                                            |             |----->1: NON-VEG--->2: VEG
                                            |
                                            |-----> INITIALIZE VALUE VLAUE OF MENU AND AC CHARGES           
                                            |
                                            |-----> ACCESS EXTERNAL CLASS METHOD BY CREATING OBJECT OF EXTERNAL CLASS

*/
import java.util.Scanner;
class MainApp1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HotelBill h1 = new HotelBill();

        System.out.println("SELECT TYPE OF HOSTEL");
        System.out.println("1: AC\n2: NON-AC");
        int acChoice = sc.nextInt();

/***************************************** WAY 1 JUST CHECK CONDITION AND CALL METHODS*******************************
 
        System.out.println("SELECT TYPE OF MENU");
        System.out.println("1: VEG\n2:NON-VEG");
        int menuChoice = sc.nextInt();

        System.out.println("QUANITITY OF DISH");
        int qty = sc.nextInt();

        if(acChoice == 1 && menuChoice == 1)
        {
           h1.ac_Veg(qty);
        }
        else if(acChoice == 1 && menuChoice == 2)
        {
            h1.ac_Nonveg(qty);
        }
        else if(acChoice == 2 && menuChoice == 1)
        {
            h1.nonAc_veg(qty);
        }
        else if(acChoice ==2 &&  menuChoice == 2)
        {
            h1.nonAc_nonVeg(qty);
        }
        else
        {
            System.out.println(" PLASE ENTER VALID COMBINATION");
        }

/*************************************THIS WAY CHECK EVERY USER CHOICE THEN EXECUTE NEXT METHOD*************************** */

        if(acChoice == 1 || acChoice == 2)
        {
            System.out.println("SELECT TYPE OF MENU");
            System.out.println("1: VEG\n2:NON-VEG");
            int menuChoice = sc.nextInt(); 

            if(menuChoice == 1 || menuChoice == 2)
            {
                System.out.println("QUANITITY OF DISH");
                int qty = sc.nextInt(); 

                if(acChoice==1 && menuChoice == 1)
                {
                    h1.ac_Veg(qty);
                }
                else if(acChoice == 1 && menuChoice ==2)
                {
                    h1.ac_Nonveg(qty); 
                }
                else if(acChoice == 2 && menuChoice == 1)
                {
                    h1.nonAc_veg(qty); 
                }
                else if(acChoice == 2 && menuChoice==2)
                {
                    h1.nonAc_nonVeg(qty); 
                }
                
            }
            else
            {
                System.out.println("PLEASE ENTER VALID CHOICE");
            }
        }
        else
        {
            System.out.println("PLEASE ENTER VALID CHOICE"); 
        }

    }
}
class HotelBill
{
    // STATICS VALUE 
    static int costForVeg = 2500;
    static int costForNonveg = 3000;
    static int acCharge = 200;
    static int nonAcCharge = 100;

    
    void ac_Veg(int qty)
    {
        int bill = costForVeg * qty;
        int totalAmount = bill + acCharge;
        double gstBill =totalAmount + (totalAmount  * 0.12);
        System.out.println("YOUR BILL AMOUNT IS: "+gstBill);
    }

    void ac_Nonveg(int qty)
    {
        int bill = costForNonveg * qty;
        int totalAmount = bill + acCharge;
        double gstBill =totalAmount + (totalAmount  * 0.12);
        System.out.println("YOUR BILL AMOUNT IS: "+gstBill);
    }

    void nonAc_veg(int qty)
    {
        int bill = costForVeg * qty;
        int totalAmount = bill + nonAcCharge;
        double gstBill = totalAmount + (totalAmount  * 0.12);
        System.out.println("YOUR BILL AMOUNT IS: "+gstBill);
    }

    void nonAc_nonVeg(int qty)
    {
        int bill = costForNonveg * qty;
        int totalAmount = bill+ nonAcCharge;
        double gstBill = totalAmount + (totalAmount  * 0.12);
        System.out.println("YOUR BILL AMOUNT IS: "+gstBill);
    }


}