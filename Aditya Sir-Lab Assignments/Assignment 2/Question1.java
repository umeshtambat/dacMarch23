import java.util.Scanner;
class Test{
	static int count=0;
	public static int calDigit(int num){
		while(num>0){
		int temp=num%10; 
		count++;
		num=num/10;
		}
			
		
		return count;
	}
}

public class Question1{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number	:	");
		int num=sc.nextInt();
		
		System.out.println("Number of digits	:"+Test.calDigit(num));
		
		
		
		
		
	}
}
			