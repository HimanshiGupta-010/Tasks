import java.util.*;
public class Product {
    public static void main(String args[])
    {
        int num1, num2; //variable declaration
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        num1 = sc.nextInt();

        System.out.println("Enter second number : ");
        num2 = sc.nextInt();

        System.out.println("Product of "+num1+" and "+num2+ " is : "+(num1*num2));
    }    
}
