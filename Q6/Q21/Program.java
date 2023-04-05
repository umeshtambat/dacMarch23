/*21.Write a program to convert state of Long instance into byte, 
short, int, long, float and double.*/

class Program{
    public static void main(String[] args){
        long l=10l;
         Long lg=new Long(l);

         byte b=lg.byteValue();
         short s=lg.shortValue();
         int i=lg.intValue();
         float f=lg.floatValue();
         double d=lg.doubleValue();

         System.out.println(b);
         System.out.println(s);
         System.out.println(i);
         System.out.println(f);
         System.out.println(d);
        
        }
}