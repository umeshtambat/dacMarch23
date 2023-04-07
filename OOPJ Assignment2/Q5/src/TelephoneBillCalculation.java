/*5. Telephone Bill Calculation
You are required to write a Java program to calculate the telephone bill for a given 
customer based on their usage. The program should take the following inputs from 
the user:
a. Customer name
b. Phone number
c. Number of calls made
d. Duration of calls (in minutes)
The program should then calculate the bill for the customerbased on the following
criteria:
a. The first 100 calls are charged at a rate of 50 cents per call.
b. Calls beyond the first 100 are charged at a rate of 25 cents per call.
c. All calls are subject to a minimum duration of 1 minute.
d. Calls with a duration less than 1 minute are rounded up to 1 minute.
e. There is a flat rate of $10 per month for all customers*/
import java.util.Scanner;
import java.lang.Math.*;
class TelephoneBill{
    private String name;
    private int phone;
    private int noOfCalls;
    private float callDuration;
    private double bill;
    
    TelephoneBill(){
    this.name=null;
    this.phone=0;
    this.noOfCalls=0;
    this.callDuration=0.0f;
    this.bill=0.0;
    }

    //setter methods
    public void setName(String name){
        this.name=name;
    }
    public void setPhome(int phone){
        this.phone=phone;
    }
    public void setNoOfCalls(int noOfCalls){
        this.noOfCalls+=noOfCalls;
    }
    public void setCallDuration(float callDuration){
        this.callDuration+=Math.round(callDuration);
    }
     public String getName(){
       return this.name;
    }

    //getter methods
    public int getPhome(){
       return this.phone;
    }
    public int getNoOfCalls(){
        return this.noOfCalls;
    }
    public float getCallDuration(){
        return this.callDuration;
    }
  
    //clients requirements
    public void billCalculation(){
        if(this.noOfCalls<=100){
            bill+=this.callDuration*0.50;
        }
        else if(this.noOfCalls>100){
            bill+=this.callDuration*0.25;

        }
        if(bill>=10)
        System.out.println("Total bill amount for the month:"+bill);
        else
        System.out.println("Total bill amount for the month:"+10);
    }
}
        

class TelephoneBillCalculation{
public static void main(String[] args)
{    Scanner sc=new Scanner(System.in);
     TelephoneBill tb=new TelephoneBill();

     System.out.println("Enter no. of Calls: ");
     tb.setNoOfCalls(sc.nextInt());

     System.out.println("Enter Call duration: ");
     tb.setCallDuration(sc.nextFloat());

     System.out.println(tb.getCallDuration());

     tb.billCalculation();
    
}
}
