import java.util.Scanner;

class ScannerDemo10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER QUANTITY");
        int qty = sc.nextInt();

        System.out.println("ENTER PRICE");
        double price = sc.nextDouble();

        System.out.println("ENTER YOUR CHOICE");
        System.out.println("1.TOTAL PRICE OF LAPTOP\n2.TOTAL PRICE OF MOBILE");
        double ch = sc.nextInt();

        if(ch==1)
        {
            laptopBill(qty,price);
        } 
        else if(ch==2)
        {
            mobilePrice(qty,price);
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
    }
    static void laptopBill(int qty,double price)
    {
        double total = qty*price;
        double gstPrice = total*0.5; //5% GST ADDED ON LAPTOP
        double totalPrice = total + gstPrice;

        System.out.println("TOTAL PRICE OF LAPTOP: "+totalPrice);
    }
    static void mobilePrice(int qty,double price)
    {
        double total = qty*price;
        double discount = total*0.1; //10% discount on mobile(subtract)
        double totalPrice = total - discount;

        System.out.println("TOTAL PRICE OF MOBILE: "+totalPrice);
    }
}

// O/P 

// ENTER QUANTITY
// 1
// ENTER PRICE
// 1000
// ENTER YOUR CHOICE
// 1.TOTAL PRICE OF LAPTOP
// 2.TOTAL PRICE OF MOBILE
// 1
// TOTAL PRICE OF LAPTOP: 1500.0