public class BankAccountTest
{
    public static void main(String[]args)
    {
        BankAccount bk= new BankAccount();
        bk.Desposit("checking",1000);
        bk.Desposit("checking",1000);
        bk.Desposit("savings", 1500);

        bk.withdraw("checking", 1200);

        
    
    }
}