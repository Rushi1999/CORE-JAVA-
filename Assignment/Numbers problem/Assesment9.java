/* Accept on character from user and check whether that character is vowel
(a,e,i,o,u) or not.
Input : E Output : TRUE
Input : d Output : FALSE
*/


import java.util.Scanner;

class Assesment9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER CHARACTER");
        char ch = sc.next().charAt(0);

        boolean res = display(ch);

        if(res==true)
        {
            System.out.println("It is Vowel");
        }
        else
        {
            System.out.println("It is not Vowel");
        }
    }
    static boolean display( char ch)
    {

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
           return true;
        }
        else
        {
           return false;
        }
    }
}

/*************************O/P**********************
ENTER CHARACTER
a
It is Vowel

ENTER CHARACTER
z
It is not Vowel
**************************************************/