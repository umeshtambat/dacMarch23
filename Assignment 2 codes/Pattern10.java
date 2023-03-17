/*
---------------------
    E
   D E
  C D E
 B C D E
A B C D E
----------------------
*/


class Pattern10{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			for(int j=1; j<=5-i; j++){
				System.out.print(" ");
			}
			for(char j=(char)(70-i); j<='E'; j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}


/*class Pattern10{
	public static void main(String[] args){
		for(char i='A'; i<='E'; i++){
			for(int j=1; j<='E'-i; j++){
				System.out.print(" ");
			}
			for(char j=(char)(134-(int)i); j<='E'; j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}*/