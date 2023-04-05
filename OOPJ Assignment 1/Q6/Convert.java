/*a. boolean value into String*/
/*b. boolean value into Boolean instance.*/
/*c. String value into boolean value*/
/*d. String value into Boolean instance.*/

class Convert{
    public static void main(String[] args){

 /*a. boolean value into String*/
        boolean b= true;
        String str1=String.valueOf(b);
        System.out.println(str1);

/*b. boolean value into Boolean instance.*/
       boolean b3= true;
       Boolean b4=new Boolean(b3);
       System.out.println(b4);



/*c. String value into boolean value*/

         String str2 = "true";
        String str3= "Umesh";
        boolean b1=Boolean.parseBoolean(str2);  //or Boolean.valueOf();
        boolean b2=Boolean.valueOf(str3);
        System.out.println(b1);
        System.out.println(b2);


/*d. String value into Boolean instance.*/
      String str4 = "Hello";
      Boolean b5=new Boolean(str4);
      System.out.println(b5);

     
    }
}



