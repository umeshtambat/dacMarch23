/*28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).*/

class Program
{
    public static void main(String[] args)
    {
        double d= 100;
        String st2="1000";

        //a. double value into String
        String s=String.valueOf(d);
        System.out.println(s);

       // b. double value into Double instance.
          Double dt=new Double(d);
          System.out.println(dt);

       //c. String instance into Double instance.
         String st=new String(st2);
         Double dt1=new Double(st);
         System.out.println(dt1);

         //d. double value into binary, octal and hexadecimal 
          long l= Double.doubleToLongBits(d);
          System.out.println(l);

        //  System.out.print("double "+d+" into binary "+ Double.toBinaryString(d));
        // we can't convert double to binary directly--> first convert double to long using doubleToLongBits()--> then long to binary
           long lt=Double.doubleToLongBits(d);
           System.out.println("double "+d+ " to binary :"+Long.toBinaryString(lt));

          System.out.println("double "+d+" into octal "+ Long.toOctalString(lt));
          System.out.print("double "+d+" into Hexadecimal "+ Double.toHexString(d));

    }
}
