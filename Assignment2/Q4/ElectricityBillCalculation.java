/*Create a class named "ElectricityBill" that has the following instance variables:
a. customerName (String)
b. unitsConsumed (double)
c. billAmount (double)
Create a constructor that initializes the customerName and unitsConsumed instance
variables.
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is:
a. For the first 100 units: Rs. 5 per unit
b. For the next 200 units: Rs. 7 per unit
c. For the remaining units: Rs. 10 per unit
Implement the "calculateBillAmount" method in the "ElectricityBill" class.
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount.*/
import java.util.Scanner;
class ElectricityBill
{
    private String customerName;
    private double unitsConsumed;
    private double billAmount;
     
     ElectricityBill()
     {
        this.customerName=null;
        this.unitsConsumed=0.0;
        this.billAmount=0.0;
     }

     public void setCustomerName(String customerName){
        this.customerName=customerName;
     }
      public void setUnitConsumed(double unitsConsumed){
        this.unitsConsumed=unitsConsumed;
     }
     

     public String getCustomerName()
     {
        return this.customerName;
     }
     
     public double getUnitConsumed()
     {
        return this.unitsConsumed;
     }
     public double getBillAmount()
     {
        return this.billAmount;
     }

    public double calculateBillAmount()
    {
        if(unitsConsumed<=100){
            this.billAmount=5*unitsConsumed;
            }
            else if(unitsConsumed>100 && unitsConsumed<=200){
            this.billAmount=7*unitsConsumed;
            }
            else if(unitsConsumed>200){
            this.billAmount=10*unitsConsumed;
            }
            return this.billAmount;
    }
}
class ElectricityBillCalculation{
    public static void main(String[] args)
    {    Scanner sc = new Scanner(System.in);
        ElectricityBill eb=new ElectricityBill();
        System.out.print("Enter Customer Name: ");
        eb.setCustomerName(sc.nextLine());
        System.out.print("Enter amount of Electricity Unit consumed: ");
        eb.setUnitConsumed(sc.nextDouble());

       double bill= eb.calculateBillAmount();
       System.out.print(eb.getCustomerName()+ " your total bill amount based on the number of units consumed: "+eb.calculateBillAmount());


    }
}