import java.util.Scanner;

	
class Test {
	static int count=0;

	public static void ignoreSpece(String str) {
		String str1=str.replace(" ","");
		System.out.print(str1);
	}
}

public class Question5{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter a String	:	");
		
			String str=sc.nextLine();
			
		Test.ignoreSpece(str);
				
				}
	  
	
}
			