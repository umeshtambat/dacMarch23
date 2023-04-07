/*6. Bank Account Management System
You are required to write a Java program to manage bank accounts. The program 
should be able to perform the following operations:
a. Create a new account
b. Deposit money into an account
c. Withdraw money from an account
d. Display the account balance
e. Display the account holder's information
Each account should have the following information:
a. Account holder's name (String)
b. Account number (int)
c. Account balance (double)
The program should be able to perform the following operations:
a. Create a new account: The program should prompt the user to enter the 
account holder's name, and generate a unique account number for the new 
account. The initial account balance should be zero.
b. Deposit money into an account: The program should prompt the user to enter 
the account number and the amount to be deposited. If the account number is 
valid, the program should add the amount to the account balance. If the 
account number is not valid, the program should display an error message.
c. Withdraw money from an account: The program should prompt the user to 
enter the account number and the amount to be withdrawn. If the account 
number is valid and the account balance is sufficient, the program should 
deduct the amount from the account balance. If the account number is not 
valid or the account balance is insufficient, the program should display an 
error message.
d. Display the account balance: The program should prompt the user to enter 
the account number and display the current balance for that account. If the 
account number is not valid, the program should display an error message.
e. Display the account holder's information: The program should prompt the 
user to enter the account number and display the account holder's name and 
current balance for that account. If the account number is not valid, the 
program should display an error message*/

import java.util.Scanner;
class Bank{
    private String accountHolderName;
    private static int accountNumber;
    private double balance;
    Scanner sc=new Scanner(System.in);
    static{
        Bank.accountNumber=100;
    }
    Bank()
    {
        this(null,  0.0);
    }
    Bank(String accountHolderName, double balance)
    {
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    public void setAccountHolderName(String accountHolderName)
    {
       this.accountHolderName=accountHolderName;
    }
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber=accountNumber;
    }
    public void setBalance(double balance)
    {
        this.balance+=balance;
    }
    public String getAccountHolderName()
    {
        return this.accountHolderName;
    }
    public int getAccountNumber()
    {
        return this.accountNumber+=1;
    }
    public double getBalace()
    {
        return this.balance;
    }
    public double removeBalance(double balance){
        return this.balance-=balance;

    }
    public void createNewAccount()
    {
      System.out.println("Enter Your name");
      this.setAccountHolderName(sc.nextLine());
      System.out.println("Your Unique Account Bank number : "+this.getAccountNumber());
      System.out.println("Bank Balance : "+this.getBalace());
    }
    public void moneyDeposite()
    {
      System.out.println("Enter Unique Account Bank number : ");
      int a=sc.nextInt();

      if(this.accountNumber==a){  
      System.out.println("Enter amount : ");
      double d=sc.nextDouble();
      this.setBalance(d);
      }
      else
      System.out.println("Invalid Unique Account Bank number!!!! Please re-Enter");
    }

     public void moneyWithdraw()
    {
      System.out.println("Enter Unique Account Bank number : ");
      int a=sc.nextInt();

      if(this.accountNumber==a){
      System.out.println("Enter amount : ");
      double d=sc.nextDouble();
      this.removeBalance(d);
      }
      else
      System.out.println("Invalid Unique Account Bank number!!!! Please re-Enter");
    }

}

class BankAccountManagement{
    public static void main(String[] args)
    {
        Bank b=new Bank();
         Bank b2=new Bank();
         
        b.createNewAccount();
        b.moneyDeposite();
       
       System.out.println( b.getBalace());
        b.moneyWithdraw();
        System.out.println( b.getBalace());

         b2.createNewAccount();
        b2.moneyDeposite();
        System.out.println( b2.getBalace());
        b2.moneyWithdraw();
         System.out.println( b2.getBalace());

    }
}