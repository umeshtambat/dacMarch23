/*
---------------------
    *
   ***
  *****
 *******
*********
----------------------
*/


class PatternStar5	{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++){
			System.out.print('*');
			}
			System.out.println();
		}
	}
}



/*import java.util.Scanner;
class PatternStar5{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	int k=n;
	
	for(int i=1; i<=n; i++){
		for(int j=1; j<=2*n-1; j++){
			if((i+j>=n+1 && i+j<=((2*i-1)+n))|| i==6){
				System.out.print("*");
			}
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	}
}*/

