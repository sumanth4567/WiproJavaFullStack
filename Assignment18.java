//program to find sum of all the digits in a given number
class Assignment18{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		while(x > 0){
			sum = sum + x%10;
			x = x/10;
		}
		System.out.println("The sum of the given number " + args[0] +" is " + sum);
	}
}
		
		
		