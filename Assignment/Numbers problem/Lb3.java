/*4. Accept one number and check whether is is divisible by 5 or not.*/
import java.util.*;
class Lb3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("ENTER NUMBER: ");
        int n = sc.nextInt();

        boolean result = divisibleByFive(n);
        if(result == true)
        {
            System.out.println("NUMBER IS DIVIDIBLE BY 5");
        }
        else
        {
            System.out.println("NUMBER IS NOT DIVISIBLE BY 5");
        }
    }
    static boolean divisibleByFive(int n)
    {
       
        if(n%5==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

// O/P 
// ENTER NUMBER:
// 5
// NUMBER IS DIVIDIBLE BY 5