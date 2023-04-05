/*19.Write a program to perform below operations on long type to 
get: 
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long*/

class Program{
    public static void main(String[] args){
        System.out.println("Long size in bite :"+ Long.SIZE);
        System.out.println("Long size in bytes :"+ Long.BYTES);
        System.out.println("Long size in bytes :"+ Long.MIN_VALUE);
        System.out.println("Long size in bytes :"+ Long.MAX_VALUE);
    }
}