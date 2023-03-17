/*
---------------------
A B C D E
A B C D
A B C
A B
A
----------------------
*/


class Pattern18{
	public static void main(String[] args){
		for(int i=1; i<=5; i++){
			
			for(char j='A'; j<=70-i; j++){
			System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

