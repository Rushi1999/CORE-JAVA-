// TO CHEK NUMBER IS POSITIVE OR NEGATIVE


import java.util.Scanner;
class TernaryOps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER NUMBER");
        int n = sc.nextInt();

        String output = (n>0)? "POSTIVE":"NEGATIVE";

        System.out.println("NO IS "+output);
    }
}