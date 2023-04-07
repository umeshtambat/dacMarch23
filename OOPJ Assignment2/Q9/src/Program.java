
/*
 * 9. Date Class
You are required to write a Java program to implement a Date class.
The Date class should have the following fields:
a. day: An integer field to store the day of the month.
b. month: An integer field to store the month of the year.
c. year: An integer field to store the year.
The Date class should have the following methods:
a. isValid(): A method to check if the date is valid or not. A date is considered 
valid if it is a valid date of the Gregorian calendar, and has a day, month, and 
year that are within a reasonable range.
b. getDayOfWeek(): A method to return the day of the week for the given date, 
where Sunday is represented by 0, Monday by 1, and so on.
c. isLeapYear(): A method to check if the year of the given date is a leap year or not.
d. getNextDay(): A method to return the date of the next day.
e. getPreviousDay(): A method to return the date of the previous day.
Example Usage
Date date = new Date(31, 12, 2022);
System.out.println(date.isValid()); // true
System.out.println(date.getDayOfWeek()); // 6 (Saturday)
System.out.println(date.isLeapYear()); // false
Date nextDay = date.getNextDay();
System.out.println(nextDay); // 01-01-2023
Date previousDay = date.getPreviousDay();
System.out.println(previousDay); // 30-12-2022
 */

 class Date
 {
    int day;
    int month;
    int year;
    public Date ()
    {

    }
    public Date(int day, int month, int year)
    {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    public void setDay(int day)
    {
        day = this.day;
    }
    public int getDay()
    {
        return this.day;
    }
    public void setMonth(int month)
    {
        month = this.month;
    }
    public int getMonth()
    {
        return this.month;
    }
    public void setYear(int year)
    {
        year = this.year;
    }
    public int getYear()
    {
        return this.year;
    }
   
 }
 class DateTest
 {
    Date dt = new Date();

    public boolean isValid()
    {
        if((dt.day>0) && (dt.day<=31) && (dt.month<12) && (dt.month>0) && (dt.year>1582))
        {
            if(((dt.year%100 == 0) && (dt.year%400 == 0)) || (dt.year%4 == 0))
            {
                if((dt.month == 2) && (dt.day<=29 ))
                System.out.println("Valid Date: ");
                return true;
            }
            else if((dt.month == 2) && (dt.month < 29))
            {
                System.out.println("Valid Date");
            }
            return true;
        }
        System.out.println("Invalid date");
        return false;
    }
    public boolean has31()
    {
        for(int i=1; i<=12; i+=2)
        {
            if(i == 7)
            {
                return true;
            }
        }
        return false;
    }
    public void isLeapYear(){
        if(dt.year%4==0){
        if(dt.year%100==0){
        if(dt.year%400==0){
           System.out.println("Leap Year");
        }
        else{
           System.out.println("Not leap year");
        }
       }
       else{
           System.out.println(" leap year");
       }
        }
        else{
           System.out.println("not a leap year");
        }
  }

  public void getNextDay()
  {
        boolean a=this.has31();
       if((dt.day==31)&&(dt.month==12))
       {
            dt.day=1;
            dt.year+=1;
            dt.month=1;
       }
      else  if((a)&&(dt.day==31)&&(dt.month<12))
      {
           dt.day=1;
           dt.month+=1;
       }
       else if((dt.day<31))
       {
           dt.day+=1;
       }
       else if((!a)&&(dt.day==30))
       {
           dt.day=1;
           dt.month+=1;
       }

    }

 }
public class Program
{
    public static void main(String [] args)
    {
        DateTest dt = new DateTest();
        dt.isValid();
        dt.isLeapYear();
        dt.getNextDay();
    }
}
