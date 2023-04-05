/*32.Write a program to accept and print full name as an argument 
from command line*/

class Program{
    public static void main (String[] args)
    {
       String str1=args[0];
       String str2=args[1];
       String str3=args[2];

       System.out.print(str1+" "+str2+" "+str3);

}
}