/*10. Credit Score Calculator Practice Question
You have been asked to write a Java program to implement a credit score calculator. 
The credit score calculator class should have the following fields:
a. creditHistory: An int to represent the length of the individual's credit history.
b. creditUtilization: A double to represent the percentage of available credit the 
individual is using.
c. paymentHistory: A boolean to represent whether the individual has a good 
payment history or not.
The credit score calculator class should have the following methods:
a. Constructors
b. Getter and setter methods
c. int calculateCreditScore(): A method to calculate the credit score based on 
the provided information. The credit score should be calculated using the 
following formula:
I. If the individual has a good payment history, the credit score should 
be calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55
II. If the individual has a bad payment history, the credit score should be 
calculated as follows:
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35  
*/


import java.util.Scanner;

class CreditScore{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    CreditScore(){

    }

    public int getCreditHistory(){
        return this.creditHistory;
    }
    public void setCreditHistory(int creditHistory){
        this.creditHistory = creditHistory;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public void setCreditUtilization(double creditUtilization){
      this.creditUtilization = creditUtilization;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
    public void setPaymentHistory(String paymentHistory){
        this.paymentHistory = Boolean.parseBoolean(paymentHistory);
    }

    public int calculateCreditScore(){

        int creditScore = (this.creditHistory * 15) + (int)(this.creditUtilization * 30);

        if(getPaymentHistory() == true){
             creditScore += 55;
        }
        else{
            creditScore += 35;
        }
        return creditScore;
    }

}

class CreditSCoreCalculator{
    private CreditScore c1 = new CreditScore();
    static Scanner sc = new Scanner(System.in);

    public void acceptRecord(){

        System.out.println("Enter credit history");
        c1.setCreditHistory( sc.nextInt() );

        System.out.println("Enter credit utilization");
        c1.setCreditUtilization( sc.nextDouble() );

        System.out.println("Enter payment history as true or false : ");
        c1.setPaymentHistory( sc.next());
    }

    public void printRecord(){
        System.out.println("Based on the following details ");
        System.out.println("Credit History : " + c1.getCreditHistory());
        System.out.println("Credit Utilization : " + c1.getCreditUtilization());
        System.out.println("Payment History : " + c1.getPaymentHistory());

        System.out.println("Your credit score is " + c1.calculateCreditScore());
    }

    public static int menuList(){

        
        System.out.println("________________________________");
        System.out.println("0.Exit");
        System.out.println("1.Accept Record.");
        System.out.println("2.Print Record");
        System.out.print("Enter choice  : ");
        return sc.nextInt();

    }
}

public class Program {
    public static void main(String[] args) {

        int choice;

        CreditSCoreCalculator cr1 = new CreditSCoreCalculator();

        while( (choice = CreditSCoreCalculator.menuList()) != 0 )
        {
            switch(choice)
            {
                case 1 : cr1.acceptRecord();
                System.out.println("________________________________");
                break;
                case 2 : cr1.printRecord();
                System.out.println("________________________________");
                break;
                default : System.out.println("Invalid Choice");
            }
        }
        
    }
    
}
