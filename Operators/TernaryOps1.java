import java.util.Scanner;
class TernaryOps1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT YOUR CHOICE");
        System.out.println("1:RED\n2:GREEN\n3:BLUE");
        int ch = sc.nextInt();

        String output = (ch==1)?"RED":((ch==2)?"GREEN":"BLUE"); /// without default condition

        System.out.println(output);

        String output1 = (ch==1)?"RED":((ch==2)?"GREEN":((ch==3)?"BLUE":"DEFAULT")); /// with default condition

        System.out.println(output1);
   
    }
}