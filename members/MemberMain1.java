/* NON-STATIC CLASS ACCESS USING OBJECT USING EXTERNAL CLASS*/

import java.util.Scanner;

class Demo
{
     int k=20;

     void test()
    {
        System.out.println("INSIDE DEMO");
    }
}

class MemberMain1
{
    public static void main(String[] args)
    {
        System.out.println("VALUE OF K:" +new Demo().k);
        new Demo().test();
    }
}