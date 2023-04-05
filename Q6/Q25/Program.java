/*25.Write a program to convert state of Float instance into byte, 
short, int, long, float and double.*/

class Program{
    public static void main(String[] args){
        float f=10.499f;
        Float ft=new Float(f);

        //Float instance into byte
        byte b= ft.byteValue();
        System.out.println(b);

        //Float instance into short
        short s= ft.shortValue();
        System.out.println(s);

         //Float instance into int
         int i= ft.intValue();
         System.out.println(i);

          //Float instance into long
          long l= ft.longValue();
          System.out.println(l);                            

           //Float instance into float
           float f1= ft.floatValue();
           System.out.println(f1);

             //Float instance into double
             double d= ft.doubleValue();
             System.out.println(d);
        
        
       }
}
