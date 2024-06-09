class Assignment22{
	public static void main(String args[]){
		int arr[] = { 1 , 2, 3 , 4 , 9 , 25 , 80};
		int sum = 0 , avg = 0 ;
		for(int i = 0 ; i < arr.length ; i++){
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + avg);
	}
}