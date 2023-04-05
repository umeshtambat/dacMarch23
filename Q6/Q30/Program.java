/*30.Write a program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.*/

class Program
{
    public static void main(String[] args)
    {
        double d1=20.57;
        double d2=20.11;

        double max=Double.max(d1,d2);
        double min=Double.min(d1,d2);
        double add=Double.sum(d1,d2);
        //double sub=Double.(d1,d2);

        System.out.println("Max number :"+max);
        System.out.println("Max number :"+min);
        System.out.println("Max number :"+add);
       // System.out.println("Max number :"+sub);
    }
}