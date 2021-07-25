import java.util.Scanner;

class Demo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("B value:");
        int B = sc.nextInt();
        System.out.println("H value:");
        int H = sc.nextInt();

        if(B>0 && H>0)
        {
            int area = B*H;
            System.out.println(+area);
        }
        else
        {
            System.out.println("less than zero");
        }
    }
}