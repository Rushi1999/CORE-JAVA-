class Demo
{
    int p = 50;
}

class DefaultConstructor
{
    public static void main(String[] args)
    {
        Demo d1 = new Demo();

        System.out.println("P VALUE IS "+d1.p);
    }
}



/* default constructor

javap DefaultConstructor
Compiled from "DefaultConstructor.java"
class DefaultConstructor {
  DefaultConstructor();
  public static void main(java.lang.String[]);
}
*/
