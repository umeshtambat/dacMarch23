/*
---------------------
        9
       898
      78987
     6789876
    567898765
   45678987654
  3456789876543
 234567898765432
12345678987654321
----------------------
*/

import java.util.Scanner;
class Pyramid5	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println();
		
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j=(n+1)-i; j<=n; j++){
				
			System.out.print(j);
		
			}
			
		for(int j=n-1; j>=(n+1-i); j--){
			
			System.out.print(j);
			}
			System.out.println();
	}
	}
}


