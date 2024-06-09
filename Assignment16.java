class Assignment16{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
		if(x <= 1){
			System.out.println("The number is not prime");
			return;
		}
		if(x == 2){
			System.out.println("The number is prime");	
			return;
		}
		if (x % 2 == 0) {
			System.out.println("The number is not prime");
			return;
        	}	
		for (int i = 3; i <= Math.sqrt(x); i += 2) {
            		if (x % i == 0){
				System.out.println("The number is not prime");
				return;
			}
            	}
		System.out.println("The given number is Prime");
        }
}