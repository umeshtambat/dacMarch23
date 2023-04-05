/*22. Write a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.*/

class Program{
   public static void main(String[] args){

       long a=1000l;
       long b=2000l;

       long max=Long.max(a,b);
       long min=Long.min(a,b);
       long add=Long.sum(a,b);

       System.out.println("Max number :"+max);
       System.out.println("Min number :"+min);
       System.out.println("Addition is :"+add);

   }
}
