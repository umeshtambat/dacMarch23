/*16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.*/

class Program{
    public static void main(String[] args) {
        int a=1000;
        String s="1000";

        //a. int value into String
        String str=String.valueOf(a);
        System.out.println(str);

        //b. int value into Integer instance.
        Integer x=new Integer(a);
        System.out.println(x);

        //c. String instance into Integer instance.
        String str1=new String(s);
        Integer y=new Integer(str1);
        System.out.println(y);

        //d. int value into binary, octal and hexadecimal string.
         //Binary
        System.out.println(Integer.toBinaryString(a));
         //Octal
         System.out.println(Integer.toOctalString(a));
         //Hexadecimal
         System.out.println(Integer.toHexString(a));
         
        
    }
}