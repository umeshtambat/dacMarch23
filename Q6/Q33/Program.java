/*33. Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.*/

class Program
{
    public static void main(String [] args)
    {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c =a+b;
        System.out.println("addition of "+a+" and "+b+" : "+c);
        System.out.println("subtraction of "+a+" and "+b+" : "+(a-b));
        System.out.println("multiplication of "+a+" and "+b+" : "+a*b);
        System.out.println("division of "+a+" and "+b+" : "+a/b);
        System.out.println();

        float d=Float.parseFloat(args[2]);
        float e=Float.parseFloat(args[3]);
        float f=d+e;
        
        System.out.println("addition of "+d+" and "+e+" : "+f);
        System.out.println("subtraction of "+d+" and "+e+" : "+ (d-e));
        System.out.println("multiplication of "+d+" and "+e+" : "+d*e);
        System.out.println("division of "+d+" and "+e+" : "+d/e);
        System.out.println();

        double g=Double.parseDouble(args[4]);
        double h=Double.parseDouble(args[5]);
        double i=g+h;

         System.out.println("addition of "+g+" and "+h+" : "+i);
        System.out.println("subtraction of "+g+" and "+h+" : "+ (g-h));
        System.out.println("multiplication of "+g+" and "+h+" : "+g*h);
        System.out.println("division of "+g+" and "+h+" : "+g/h);
        System.out.println();

    }
}