/*
---------------------
     *
    * *
   *   *
  *     *
 *       *
* * * * * *
----------------------
*/

import java.util.Scanner;
class Pyramid13	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println();
		
		
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=2*n-1; j++){
				if( (j+i)==(n+1) || (j-i)==(n-1) ||(i==n && j%2!=0))
				System.out.print("*");
			else
                System.out.print(" ");				
			}
			
			System.out.println();
		}
		
	}
}



