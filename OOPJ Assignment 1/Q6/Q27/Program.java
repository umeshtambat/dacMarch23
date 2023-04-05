/*27.Write a program to perform below operations on Double type to 
get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double*/

class Program
{
    public static void main(String[] args)
    {
        System.out.println("Double value in bits "+Double.SIZE);
        System.out.println("Double value in bytes "+Double.BYTES);
        System.out.println("Minimum Double value "+Double.MIN_VALUE);
        System.out.println("Maximum Double value "+Double.MAX_VALUE);
    }
}