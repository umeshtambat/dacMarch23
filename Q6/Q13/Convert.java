/*Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.*/

class Convert{
    public static void main(String[] args) {
     short s=100;

     //a. short value into String
     String str=String.valueOf(s);
     System.out.println(str);

     //b. short value into Short instance.
     Short st=new Short(s);
     System.out.println(st);

     //c. String instance into Short instance.
     String str1=new String("1000");
     Short st1=new Short(str1);
     System.out.println(st1);

        
    }
}
