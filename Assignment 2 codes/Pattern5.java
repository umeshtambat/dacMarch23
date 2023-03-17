/*
---------------------
A
B B
C C C
D D D D
E E E E E
----------------------
*/


class Pattern5{
	public static void main(String[] args){
		for(char i='A'; i<='E'; i++){
			for(int j=65; j<=i; j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}