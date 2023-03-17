/*
---------------------
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
----------------------
*/


class Pattern17{
	public static void main(String[] args){
		int k=0;
		for(int i=1; i<=5; i++){
			
			for(int j=1; j<=i; j++){
				k=k+1;
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}


