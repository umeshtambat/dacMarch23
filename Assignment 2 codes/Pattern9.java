/*
---------------------
    A
   A B
  A B C
 A B C D
A B C D E
----------------------
*/


/*class Pattern9{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(char j='A'; j<=(char)(64+i); j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/


class Pattern9{
	public static void main(String[] args){
		for(char i='A'; i<='E'; i++){
			for(int j=1; j<='E'-i; j++){
				System.out.print(" ");
			}
			for(char j='A'; j<=i; j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}