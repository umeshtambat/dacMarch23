import java.util.Scanner;

	
class Test {
	static int count=0;

	public static int sumDigit(int num) {
		while (num > 0) {
			int temp = num % 10;
			num = num / 10;
			count+=temp;

		}
		
		return count;

	}
}

public class Question3{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter a Number	:	");
		
			int num=sc.nextInt();
			int sum=Test.sumDigit(num);
		System.out.println("Sum of the digits	:"+sum);
				
				}
	  
	
}
			