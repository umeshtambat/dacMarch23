/*Write a program to convert state of Short instance into byte, 
short, int, long, float and double.*/

class StateConvert{
    public static void main(String[] args){
         short x=125;
         Short s=new Short(x);  // short instance
         byte b=s.byteValue();
         short st=s.shortValue();
         int i=s.intValue();
         float f=s.floatValue();
         double d=s.doubleValue();

         System.out.println("Short instance into byte :"+b );
         System.out.println("Short instance into short :"+st );
         System.out.println("Short instance into int :"+i );
         System.out.println("Short instance into float :"+f );
         System.out.println("Short instance into double :"+d );



    }
}