import java.util.*;

class Interest {
    public static void main(String args[])
    {
        double p, r, t, s_interest, c_interest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principal : ");
        p = sc.nextDouble();
        System.out.println("Enter the annual rate of interest : ");
        r = sc.nextDouble();
        System.out.println("Enter the time (year) : ");
        t = sc.nextDouble();
        s_interest = (p * r * t)/100;
        c_interest = p * Math.pow(1.0 + r/100.0, t) - p;
        System.out.println("Simple Interest : " + s_interest);
         System.out.println("Simple Interest : " + c_interest);
    }
}