/*
---------------------
******
*   *
*  *
* *
**
*
----------------------
*/

import java.util.Scanner;
class Pyramid10	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=n; j++){
				if(i==1 || j==1 || i+j==7)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			
		System.out.println();
			}
	}
}


