class AssignmentNine{
	public static void main(String args[]){
		char x = '&';
		if(x >= 48 && x<=57){
			System.out.println("Digit");
		}
		else if((x >= 65 && x <= 90) || (x >= 97 && x<=122)){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Special Character");
		}
	}
}