/*31.Read the documentation of NumberFormatException and try to 
generate it in Java code.*/

import java.util.Scanner;
class Program{
    
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number:");
        String str=sc.nextLine();
        Integer a=new Integer(str);
         System.out.println(a);
    }
}

