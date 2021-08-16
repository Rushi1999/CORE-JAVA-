// static block (explicitly)

class BlockDemo1
{
    public static void main(String[] args)
    {
        System.out.println("MAIN METHOD");

        // call static block by loading k in main

        System.out.println("K VALUE IS: "+Master.k);

    }
}
class Master
{
    static  int k = 15;
    static 
    {
        
        System.out.println("MASTER STATIC BLOCK");
    }
}