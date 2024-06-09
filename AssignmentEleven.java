class AssignmentEleven{
	public static void main(String args[]){
		char x = 'y';
		if(x >= 65 && x <= 90){
			x=Character.toLowerCase(x);
			System.out.println("The charcter is in upper case and after conversion : " + x);
		}
		else{
			x=Character.toUpperCase(x);
			System.out.println("The charcter is in lower case and after conversion : " + x);
		}
	}
}