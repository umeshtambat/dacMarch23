/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/




class Pattern1{
	public static void main(String[] args){
		for(int i=1; i<=5 ; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}



/*class Pattern{
	public static void main(String[] args){
		for(char i='A'; i<='E' ; i++){
			for(char j='A'; j<=i; j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
o/p
A
A B
A B C
A B C D
A B C D E*/