/*23.Write a program to perform below operations on float type to 
get: 
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float*/

class Program{
    public static void main(String[] args){
        System.out.println("Float size in bits :"+ Float.SIZE);
        System.out.println("Float size in bytes :"+ Float.BYTES);
        System.out.println("Float min value :"+ Float.MIN_VALUE);
        System.out.println("Float max value :"+ Float.MAX_VALUE);
    }
}
