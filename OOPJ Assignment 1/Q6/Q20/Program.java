/*20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.*/

class Program{
    public static void main(String[] args){
        long l=1000;
       
        //a. long value into String
        String str=String.valueOf(l);
        System.out.println(str);

       // b. long value into Long instance.
        Long lg=new Long(l);
        System.out.println(lg);

        // c. String instance into Long instance.
        String str1=new String("1000");
        Long lg1=new Long(str1);
        System.out.println(lg1);

        //d. long value into binary, octal and hexadecimal string.
        System.out.println("Long "+l+ " to binary :"+Long.toBinaryString(l));
        System.out.println("Long "+l+ " to octal :"+Long.toOctalString(l));
        System.out.println("Long "+l+ " to Hexadecimal :"+Long.toHexString(l));


    }
}