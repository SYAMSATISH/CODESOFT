import java.util.Scanner;
class BankAccount
{
    private  double balance;
    public BankAccount(double balance)
    {
        this.balance = balance;
    }
    public double getBalance()
    {
        return balance;
    }
    public void deposit(double amount)
    {
        balance += amount;
    }
    public boolean withdraw(double amount)
    {
        if(balance >= amount)
        {
            balance = amount;
            return true;
        }
        else{
            return false;
        }
    }
}
class ATM
{
    private  BankAccount account;
    public ATM(BankAccount account)
    {
        this.account = account;
    }
    public void  withdraw(double amount)

    {
                if(amount <= 0)

    {
        System.out.println("Invalid amount.");
        return;
    }
                if(account.withdraw(amount))
    {
        System.out.println("Withdrawal successful.Current balenc:" + account.getBalance());
    }
                else
    {
        System.out.println("Insufficient funds.");
    }
}
public void deposit(double amount)
{
    if (amount <= 0)
    {
        System.out.println("Invalid amount.");
        return;
    }
    account.deposit(amount);
    System.out.println("Deposit successful. Current balence:" + account.getBalance());
}
public void chwckBalence()
{
    System.out.println("Current balence." +account.getBalance());
}

    public void checkBalence() {
    }
}
public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double intialBalence = scanner.nextDouble();
        BankAccount account = new BankAccount(intialBalence);
        ATM atm = new ATM(account);
        boolean quit = false;
        while (!quit) {
            System.out.println("\n ATM Menu.");
            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balence");
            System.out.println("4.Quit");
            System.out.println("Enter your choice.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    ;
                    System.out.println("Enter amount to withdraw.");
                    double withdrawAmount = scanner.nextDouble();

                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    ;
                    System.out.println("Emter amount to Deposit");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    ;
                    atm.checkBalence();
                    break;
                case 4:
                    ;
                    System.out.println("Invalid choice.please enter a number from 1 to 4");
            }
        }
        scanner.close();
        System.out.println("Thank you for using the Atm");
    }

}
