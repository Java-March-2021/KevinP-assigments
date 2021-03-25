import java.util.Random;
public class BankAccount
{
    private String accountNumber;
    ;
    private double checkingBalance=0;
    private double savingsBalance=0;
    public static int countOfAccounts;
    public static double allAccountsBalance;
    private double amount;

    public double getCheckingBalance()
    {
        return checkingBalance;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }


    public BankAccount()
    {
        countOfAccounts++;
        this.accountNumber=GenerateAccountNumber();
    }

    public String GenerateAccountNumber()
        {
            String randomAccount="";
            Random rn = new Random();
            for (int i=0;i<10;i++)
                {
                    randomAccount+=rn.nextInt(10);
                }
                System.out.println("New account generated");
                System.out.println("the account created is " + randomAccount);
                return randomAccount;
            
        }

    public static int NumberOfAccounts()
    {
        System.out.println("Number of accounts" + " " + countOfAccounts);
        return countOfAccounts;
    }

    public static double TotalMoneyInBank()  
    {
        
        return allAccountsBalance;

    }

    public void Desposit(String typeOfAccount, double amount)
    {

        if (typeOfAccount.equals("checking"))
        {
            checkingBalance = checkingBalance + amount;
            System.out.println("Checking balance after deposit" + " " + checkingBalance);
        }

        else if (typeOfAccount.equals("savings"))
        {
            savingsBalance = savingsBalance + amount;
            System.out.println("savings balance after deposit" + " " + savingsBalance);
        }
        else
         {
            System.out.println("Wrong Account type");
        }
        
    
    }

    public void withdraw(String typeOfAccount, double amount)
    {
            if (typeOfAccount.equals("checking"))
            {
                    if (amount>checkingBalance)
                    {
                        System.out.println("Insuficient balance");
                        
                    }
                    else 
                    {
                        checkingBalance = checkingBalance - amount;
                        System.out.println("checkin balance after withdraw" + checkingBalance);

                        
                    }
            }

            else if (typeOfAccount.equals("savings"))
                    {
                    if (amount>savingsBalance)
                    {
                        System.out.println("Insuficient balance");
                        return;
                    }
                    else
                    {
                        savingsBalance = savingsBalance - amount;
                        System.out.println("checkin balance after withdraw" + savingsBalance);
                    }
                        allAccountsBalance = allAccountsBalance - amount;
                        System.out.println("All Bank accounts balance = " + allAccountsBalance);

                    
            }

    }
    {


    }





{
}



}