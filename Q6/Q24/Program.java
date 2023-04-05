/*24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.*/


class Program{

    public static void main(String[] args){
       float f=10.3f;

       //a. float value into String
       String s=String.valueOf(f);
       System.out.println(s);

       //b. float value into Float instance.
       Float ft=new Float(f);
       System.out.println(f);

       //c. String instance into Float instance.
       String st=new String("100.6");
       Float ft1=new Float(st);
       System.out.println(ft1);

        //d. float value into hexadecimal string.
        
        System.out.println("Float value "+f+" into Hexadecimal :"+Float.toHexString(f));

    }
}