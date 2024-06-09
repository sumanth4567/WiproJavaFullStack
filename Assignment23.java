class Assignment23{
	public static void main(String args[]){
		int arr[] = { 1 , 2, 3 , 4 , 9 , 25 , 80};
		int min = arr[0] , max = arr[0] ;
		for(int i = 0 ; i < arr.length ; i++){
			if( min > arr[i] ){
				min = arr[i];
			}
			if( max < arr[i] ){
				max = arr[i];
			}
		}
		System.out.println("Minimum is : " + min);
		System.out.println("Maximum is : " + max);
	}
}