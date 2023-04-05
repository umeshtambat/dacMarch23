/*26.Write a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.*/

class Program{
    public static void main(String[] args){
        float a=10.67f;
        float b=11.89f;
        float max=Math.max(a,b);
        float min=Math.min(a,b);
        float add=Float.sum(a,b);

        System.out.println("Max value :"+max);
        System.out.println("Min value :"+min);

    }
}