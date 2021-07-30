/* ACCESS NON-STATIC VARIABLE FROM EXTERNAL CLASS AS WELL AS WE CAN ACCEPT NON-STATIC METHOD FROM EXTERNAL CLASS BY CEREATING OBJECT */

class Display
{
    int k =20;
    void test()
    {
        System.out.println("INSIDE TEST METHOD");
    }
}
class MainApp5
{
    public static void main(String[] args)
     {
         Display dl = new Display(); /// create refrence variable for the accepting non-static value from external class

        System.out.println("NON-STATIC K VALUE IS:"+dl.k);
        
        dl.test();
    }
}