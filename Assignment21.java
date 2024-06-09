class Assignment21{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int temp = x;
		int temp1 = x;
		int y = 0;
		int i = 0;
		while(x > 0){
			x = x/10;
			i=i+1;
		}
		while( temp > 0){
			y = y + ((temp%10)*(int)(Math.pow(10 , i-1)));
			temp = temp/10;
			i--;
		}
		System.out.println("The given number is : " + args[0]);
		System.out.println("The reversed number is : " + y);
		if( temp1 == y ){
			System.out.println("The given number is a palindrome");
		}
		else{
			System.out.println("The given number is not a palindrome");
		}
	}
}
			