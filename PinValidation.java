import java.util.regex.*;
import java.util.*;

class PinValidation {
    public static boolean isValidPinCode(String pincode)
    {
        String regex = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";
        Pattern p = Pattern.compile(regex);

        if(pincode == null)
        {
            return false;
        }

        Matcher m = p.matcher(pincode);
        return m.matches();
    }
    public static void main(String args[])
    {
        String num1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter pin code");
        num1 = sc.nextLine();
        System.out.println(num1  + " : " + isValidPinCode(num1));
    }    
}
