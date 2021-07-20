import java.util.Scanner;

class ScannerDemo4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER BASIC SALARY");
        Double basic = sc.nextDouble();

        System.out.println("ENTER HRA SALARY");
        Double hra = sc.nextDouble();

        System.out.println("ENTER PF SALARY");
        Double pf = sc.nextDouble();

        System.out.println("ENTER INCENTIVE SALARY");
        Double incentive = sc.nextDouble();

        System.out.println("ENTER TAX SALARY");
        Double tax = sc.nextDouble();


        double salary1 = netSalary(basic,hra,pf,incentive,tax);
        double salary2 = grassSalary(basic,hra,pf);

        System.out.println("NET SALARY IS: "+salary1);
        System.out.println("GRASS SALARY IS: " +salary2);

    }
    static double  netSalary(double basic,double hra,double pf,double incentive,double tax)
    {

        double net = (basic + hra+ pf+incentive) -pf-tax;

        return net;
    }
    static double grassSalary(double basic,double hra,double pf)
    {
        double grass = basic+hra+pf;

        return grass;
    }

}




// O/P

// ENTER BASIC SALARY
// 10000
// ENTER HRA SALARY
// 200
// ENTER PF SALARY
// 100
// ENTER INCENTIVE SALARY
// 5000
// ENTER TAX SALARY
// 100
// NET SALARY IS: 15100.0
// GRASS SALARY IS: 10300.0