/*
---------------------
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *
----------------------
*/

import java.util.Scanner;
class Pyramid11	{
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
				System.out.print("*"+" ");
				
			}
			
		System.out.println();
		}
	}
}



