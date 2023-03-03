import java.util.*;
public class ConvertCurrency {
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type 1 for Rupee to Dollar conversion : ");
    System.out.println("Type 2 for Dollar to Rupee conversion : ");
    int choice = sc.nextInt();
    switch(choice)
    {
        case 1 :
        System.out.println("Enter rupee amount : ");
        double r1 = sc.nextDouble();
        double d1 = r1/82.32;
        System.out.println(r1 + " rupees => " + d1 + " dollars ");
        break;

        case 2:
        System.out.println("Enter dollar amount : ");
        double d2 = sc.nextDouble();
        double r2 = d2 * 82.32;
        System.out.println(d2 + " dollars => " + r2 + " rupees ");
        break;

        default:
        System.out.println("Incorrect Choice");
    }
   }
}
