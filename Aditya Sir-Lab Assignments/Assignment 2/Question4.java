import java.util.Scanner;

	
class Test {
	static int count=0;

	public static void ignoreSpecialChar(String str) {
		System.out.print("Output :");
		for(int i=0; i<str.length(); i++){
			if(String.valueOf(str.charAt(i)).matches("[A-Za-z]+")){
			System.out.print(str.charAt(i));	
		}
		
		}

	}
}

public class Question4{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
			System.out.print("Enter a String	:	");
		
			String str=sc.nextLine();
			
		Test.ignoreSpecialChar(str);
				
				}
	  
	
}
			