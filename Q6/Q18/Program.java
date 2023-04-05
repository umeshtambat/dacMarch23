/*18. Write a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.*/

class Program{
    public static void main(String[] args){
        int a=50;
        int b=60;

       int max=Integer.max(a,b);    //   int max=Math.max(a,b); 
       int min=Integer.min(a,b);   //    int min=Math.min(a,b);
       int add=Integer.sum(a,b);

        System.out.println("Max numer :"+max);
        System.out.println("Min numer :"+min);
        System.out.println("Min numer :"+add);
    }
}

