/*
---------------------
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
----------------------
*/

import java.util.Scanner;
class Pyramid7	{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++){
			
			for(int j=1; j<=i-1; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=(n+1)-i; j++){
				
			System.out.print(((n+1)-i)+" ");
			}
			
			System.out.println();
		}
        	
	}
}

