/*11.Accept character from command line and perform below operations. Here you can use charAt() method to extract character:
a. Check whether entered character is letter or digit. If it 
is digit then print its values as well as code point.
b. If it is character then check whether it is in lowercase? 
If it is in lowercase then convert it into upper case and 
print it well as its code point. If it is in uppercase 
then convert it into lower case and print it well as its 
code point.*/

class Program {
    public static void main(String[] args){
        char c=args[0].charAt(0);
        int a=(int)c;
        if ((a >= 48 && a <= 57)  || (a>=97 && a<=122)  || (a>=65 && a<=90))
        {
             if(a>=48 && a<=57)
             {
               System.out.println("Entered number :"+ c);
               System.out.println("Unicode : "+ a);
             }
          else if ((a>=97 && a<=122))
          {
            System.out.println("Entered number :"+ Character.toUpperCase(c));
            System.out.println("Unicode : "+ a);
          }
          else if ((a>=65 && a<=90))
          {
            System.out.println("Entered number :"+ Character.toLowerCase(c));
            System.out.println("Unicode : "+ a);
          }
        

        }
    }
}

