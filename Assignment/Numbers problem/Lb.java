/* DIVISION OF TWO NUMBER*/

import java.util.*;
class Lb
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("FIRST NUMBER");
        float n1 = sc.nextFloat();
        System.out.println("SECOND NUMBER");
        float n2 = sc.nextFloat();
        float result = division(n1,n2);
        System.out.println("DIVISION IS: "+result);
    }
    static float division(float n1,float n2)
    {
        float result = n1/n2;

        return result;
    }
}


// O/P 

// FIRST NUMBER
// 1
// SECOND NUMBER
// 2
// DIVISION IS: 0.5