/*Write a program to perform below operations on short type to 
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short*/

class Operation{
    public static void main(String[] args){
    
    //a. The number of bits used to represent a short value
    System.out.println("short value in bits "+Short.SIZE);
    
    //b. The number of bytes used to represent a short value
    System.out.println("short value in bytes "+Short.BYTES);

    //c. The minimum value a short
    System.out.println("Minimum value of short "+Short.MIN_VALUE);

    //d. The maximum value a short
    System.out.println("Maximun value of short "+Short.MAX_VALUE);

    }
}
