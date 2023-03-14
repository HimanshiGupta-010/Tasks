class Account {    
    int accountNo;
    String name;
    String address;
    int phoneNo;
    String DOB;
    double balance;

    public void setAccountNo(int newAccountNo)
    {
        accountNo = newAccountNo;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setAddress(String newAddress)
    {
        address = newAddress;
    }

    public void setPhoneNo(int newPhoneNo)
    {
        phoneNo = newPhoneNo;
    }

    public void setDOB(String newDOB)
    {
        DOB = newDOB;
    }

    public void setBalance(double newbalance)
    {
        balance = newbalance;
    }


    public int getAccountNo()
    {
        return accountNo;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }

    public int getPhoneNo()
    {
        return phoneNo;
    }

    public String getDOB()
    {
        return DOB;
    }

    public double getBalance()
    {
        return balance;
    }

    Account() {}

    Account(int accountNo, String name, String address, int phoneNo, String DOB, double balance)
    {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.DOB = DOB;
        this.balance = balance;
    }
    
    public void closeAccount()
    {
        System.out.println("Inside closeAccount() method");
    }
}
    
class SavingsAccount extends Account {
        
        public void withdraw(double withdrawAmount)
        {
            System.out.println("Inside withdraw() method of SavingsAccount class");    
        }

        public void deposite(double depositeAmount)
        {
            System.out.println("Inside depositeAmount() method of SavingsAccount class");
        }

        public void fixedDeposite()
        {
            System.out.println("Inside fixedDeposite() method of SavingsAccount class");
        }
}

class LoanAccount extends Account {
        
        public void payEMI()
        {
            System.out.println("Inside payEMI() method of LoanAccount class");
        }

        public void topUpLoan()
        {
            System.out.println("Inside topUpLoan() method of LoanAccount class");
        }

        public void repayment()
        {
            System.out.println("Inside repayment() method of LoanAccount class");
        }
}

public class Example
{
    public static void main(String args[])
    {
        LoanAccount la = new LoanAccount();
        SavingsAccount sa = new SavingsAccount();
        
        System.out.println("Account Number : "+ la.getAccountNo());
        System.out.println("Name : "+ la.getName());
        System.out.println("Address : "+ la.getAddress());
        System.out.println("Phone Number : "+ la.getPhoneNo());
        System.out.println("Date of birth Number : "+ la.getDOB());
        System.out.println("Balance : "+ la.getBalance());

        la.payEMI();
        la.topUpLoan();
        la.repayment();

        sa.setAccountNo(122346);
        sa.setName("Himanshi Gupta");
        sa.setAddress("Indore");
        sa.setPhoneNo(3537567);
        sa.setDOB("10-5-2000");
        sa.setBalance(25000);

        System.out.println("Account Number : "+ sa.getAccountNo());
        System.out.println("Name : "+ sa.getName());
        System.out.println("Address : "+ sa.getAddress());
        System.out.println("Phone Number : "+ sa.getPhoneNo());
        System.out.println("Date of birth Number : "+ sa.getDOB());
        System.out.println("Balance : "+ sa.getBalance());

        sa.withdraw(100);
        sa.deposite(200);
        sa.fixedDeposite();

        sa.closeAccount();
    }
} 


