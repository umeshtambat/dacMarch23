import java.util.Scanner;
class Test{
	static int evenCount=0;
	static int oddCount=0;
	public static void calDigit(int num){
		while(num>0){
		int temp=num%10;
        num=num/10;		
		if(temp%2==0)
		 evenCount++;
		else
		 oddCount++;
	    
		}
     }
}

public class Question2{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("Enter a Number	:	");
		try{
			int num=sc.nextInt();
			Test.calDigit(num);
		}catch(RuntimeException e)
		{e.printStackTrace();
		
		System.out.println("Number of even digits	:"+Test.evenCount+" Number of odd digits	:"+Test.oddCount);
		continue;
		}
	  }
	}
}
			