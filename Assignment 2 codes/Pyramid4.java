/*
---------------------
        1
       121
      12321
     1234321
    123454321
   12345654321
  1234567654321
 123456787654321
12345678987654321
----------------------
*/

import java.util.Scanner;
class Pyramid4	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println();
		
		
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++){
			System.out.print(j);
			}
			
		for(int j=i-1; j>=1; j--){
			System.out.print(j);
			}
			System.out.println();
			}
	}
}


