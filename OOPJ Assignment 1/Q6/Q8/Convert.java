/*
a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.
*/

class Convert{
    public static void main(String[] args){
        byte b= 100;

        //a. byte value into String
        //String str1=Byte.toString(b);
          String str1=String.valueOf(b);
        System.out.println("byte value "+b+" into String "+str1 );


        //b. byte value into Byte instance.
          byte a=100;
          Byte byteInstance=new Byte(a);
          System.out.println("byte value into Byte instance " + byteInstance);

        //c. String instance into Byte instance.
        
          String str =new  String("111");
          Byte b1=new Byte(str);
          System.out.println("String instance into Byte instance " + b1);

    }
}