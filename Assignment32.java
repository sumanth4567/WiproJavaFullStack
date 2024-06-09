class Assignment32{
	public static void main(String args[]){
		int arr[] = {1,1,4,1,2,1,4,1,4};
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=1 || arr[i]!=4){
				System.out.println("The array contains numbers other than 1 and 4");
				break;
			}
		}
	}	
}