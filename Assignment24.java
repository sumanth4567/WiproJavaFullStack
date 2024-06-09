class Assignment24{
	public static void main(String args[]){
		int arr[] = { 1 , 2, 3 , 4 , 9 , 25 , 80};
		int x = Integer.parseInt(args[0]);
		int index = -1;
		for(int i = 0 ; i < arr.length ; i++){
			if( arr[i] == x){
				index = i;
			}
		}
		if(index != -1){
			System.out.println("The value is present at index : " + index);
		}
		else{
			System.out.println("The value is not present");
		}
	}
}