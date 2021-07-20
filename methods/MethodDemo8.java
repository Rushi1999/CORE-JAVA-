/* NON-VOID METHOD*/


class MethodDemo8
{
    public static void main(String[] args)
    {
      String finalResult= test();

      System.out.println("FINAL STRING: "+finalResult);
    }
    static String test()
    {
        String s1="Rushi";
        String s2="Jankar";

        String result=s1+s2;

        return result;
    }
}