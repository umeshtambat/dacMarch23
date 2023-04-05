/*17. Write a program to convert state of Integer instance into 
byte, short, int, long, float and double.*/

class Program{
    public static void main(String[] args){
        int a=100;
        Integer it=new Integer(a);   //Integer Instance

        byte b=it.byteValue();
        short s=it.shortValue();
        int i=it.intValue();
        long l=it.longValue();
        float f=it.floatValue();
        double d=it.doubleValue();
        

        System.out.println("Integer instance into byte :"+b );
        System.out.println("Integer instance into short :"+s );
        System.out.println("Integer instance into int :"+i );
        System.out.println("Integer instance into long :"+l );
        System.out.println("Integer instance into short :"+f );
        System.out.println("Integer instance into double :"+d );
 




    }
}
