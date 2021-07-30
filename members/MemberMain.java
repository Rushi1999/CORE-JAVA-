/* STATIC CLASS ACCESS USING OBJECT USING EXTERNAL CLASS*/


import java.util.Scanner;

class Demo
{
    static int k=20;

    static void test()
    {
        System.out.println("INSIDE DEMO");
    }
}

class MemberMain
{
    public static void main(String[] args)
    {
        System.out.println("VALUE OF K:" +Demo.k);
        Demo.test();
    }
}