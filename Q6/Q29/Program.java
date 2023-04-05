/*29.Write a program to convert state of Double instance into byte, 
short, int, long, float and double.*/

class Program
{
    public static void main(String[] args)
    {
        double d1=100.44;
        Double d=new Double(d1);

        byte b= d.byteValue();
        System.out.println(b);

        short s= d.shortValue();
        System.out.println(s);

        int i= d.intValue();
        System.out.println(i);

        long l= d.longValue();
        System.out.println(l);

        float f= d.floatValue();
        System.out.println(f);

        double d2= d.doubleValue();
        System.out.println(d2);
    }

}