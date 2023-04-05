/*15. Write a program to perform below operations on int type to 
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer*/

class Program{
    public static void main(String[] args){
        System.out.println("Size of integer in bits :"+Integer.SIZE);
        System.out.println("Size of integer in Bytes :"+Integer.BYTES);
        System.out.println("Size of integer in Bytes :"+Integer.MIN_VALUE);
        System.out.println("Size of integer in Bytes :"+Integer.MAX_VALUE);       
    }
}