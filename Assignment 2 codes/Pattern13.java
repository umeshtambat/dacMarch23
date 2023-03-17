/*
---------------------
    A
   B B
  C C C
 D D D D
E E E E E
----------------------
*/


class Pattern13{
	public static void main(String[] args){
		for(char i='A'; i<='E'; i++){
			for(int j=1; j<=69-i; j++){
				System.out.print(" ");
			}
			for(char j='A'; j<=i; j++){
			System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}


/*class Pattern13{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(char j=(char)(66-i); j<=; j++){
			System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}*/

