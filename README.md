# CODESOFT
# ATM Interface

This Java program implements an ATM (Automated Teller Machine) interface where users can perform various banking operations such as withdrawing money, depositing money, and checking their balance.

## Classes

### `BankAccount`

- Represents a bank account with methods to manage the balance.

#### Methods:

- `public BankAccount(double initialBalance)`: Constructor to initialize the bank account with an initial balance.
  
- `public double getBalance()`: Returns the current balance of the account.
  
- `public void deposit(double amount)`: Adds the specified amount to the account balance.
  
- `public boolean withdraw(double amount)`: Attempts to withdraw the specified amount from the account. Returns `true` if successful, `false` if there are insufficient funds.

### `ATM`

- Interacts with a `BankAccount` object to perform ATM operations.

#### Methods:

- `public ATM(BankAccount account)`: Constructor to initialize the ATM with a bank account.
  
- `public void withdraw(double amount)`: Withdraws the specified amount from the bank account. Displays success or failure messages based on the result.
  
- `public void deposit(double amount)`: Deposits the specified amount into the bank account. Displays success message along with current balance.
  
- `public void checkBalance()`: Displays the current balance of the bank account.

### `Main`

- Contains the main method to run the ATM program.

#### Features:

- Displays an ATM menu with options to withdraw, deposit, check balance, and quit.
  
- Uses a `Scanner` object to read user input for menu choices and transaction amounts.

#### How to Use:

1. **Compile the Program:**
   ```bash
   javac Main.java
