/*Write a program to convert state of Byte instance into byte, 
short, int. long, float and double.*/

class StateConvert{
    public static void main(String[] args){

        Byte b=new Byte((byte)100);
        byte b1=b.byteValue();
        short s=b.shortValue();
        int i=b.intValue();
        long l=b.longValue();
        float f=b.floatValue();
        double d=b.doubleValue();

        System.out.println("Byte instance "+b+" into byte "+ b1);
        System.out.println("Byte instance "+b+" into short is "+ s);
        System.out.println("Byte instance "+b+" into int is "+ i);
        System.out.println("Byte instance "+b+" into float is "+f );
        System.out.println("Byte instance "+b+" into double is "+d );

    }
}
