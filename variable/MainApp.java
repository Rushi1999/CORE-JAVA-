class Demo
{
    // class varible

    static int j;

    // instance varible

    boolean b;
    String s;

    void test()
    {
        System.out.println("INSIDE TEST METHOD");
    }
}

class MainApp
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();
        System.out.println("VALUE OF J IS " +Demo.j);// 0
        System.out.println("VALUE OF b "+d1.b); // FAlSE
        System.out.println("VALUE OF S "+d1.s); //NULL

        d1.test();
    }
}


/*
VALUE OF J IS 0
VALUE OF b false
VALUE OF S null
INSIDE TEST METHOD
*/