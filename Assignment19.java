/*program to print the following pattern
	*
	* *
	* * *
	if x = 3
*/
class Assignment19{
	public static void main(String args[]){
		int x = Integer.parseInt(args[0]);
			
		for(int i = 0 ; i < x ; i++){
			for( int j = 0 ; j <= i ; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
} 