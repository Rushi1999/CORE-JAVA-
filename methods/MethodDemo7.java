//ARITHMATIC OPERATION USING EXTERNAL METHOD AND CALLING METHOD INSIDE ANOTHER METHOD

class MethodDemo7
{
    public static void main(String[] args)
    {
        addition(10,20);
    }
    static void addition(double no1,double no2)
    {
       double Total=no1+no2;
       System.out.println("ADDITION IS: "+Total);
       subtraction(no1,no2);
    }
    static void subtraction(double no1,double no2)
    {
        double Total=no1-no2;
        System.out.println("SUBTRACTION IS: " +Total);
        multiplication(no1,no2);
    }
    static void multiplication(double no1,double no2)
    {
        double Total=no1*no2;
         System.out.println("MULTIPLICATION IS: "+Total);
         division(no1,no2);
    }
    static void division(double no1,double no2)
    {
        double Total=no1/no2;
        System.out.println("DIVISION IS: " +Total);
        mod(no1,no2);
    }
    static void mod(double no1,double no2)
    {
        double Total=no1%no2;
        System.out.println("MOD IS "+Total);
    }

}