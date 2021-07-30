/* STATIC MEMBERS
---> STATIC MEMBER ONLY ACCESIBLE INSIDE STATIC METHOD*/

class Display
{
   static int k=10;

    static void test()
    {
        System.out.println("INSIDE TEST METHOD");
    }
}
class MainApp4
{
    public static void main(String[] args)
    {
        System.out.println("VALUE K IS: " +Display.k);
        
        Display.test();
    }
}