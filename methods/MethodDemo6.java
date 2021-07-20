class MethodDemo6
{
    public static void main(String[] args)
    {
        laptopPrice(30,500);
        mobilePrice(40,400);
    }
    static void laptopPrice(double qty, double price)
    {
        double Amount= qty*price;
        double Total_Amount= Amount +(Amount *0.05); // applied 5% discount on laptop
        System.out.println("LAPTOP TOATL AMOUNT: "+Total_Amount);
    }
    static void mobilePrice(double qty, double price)
    {
        double Amount= qty*price;
        double Total_Amount= Amount +(Amount *0.1);//applied 10% discount on mobile
        System.out.println("MOBILE TOATL AMOUNT: "+Total_Amount);
    }
}