class Assignment29{
	public static void main(String args[]){
		int arr[] = {1,2,6,4,5,3,7,8,9};
		int six_pos=0 , sev_pos=0;
		int sum=0;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i]==6){
				six_pos=i;
			}
			if(arr[i]==7){
				sev_pos=i;
			}
		}
		if(six_pos<sev_pos){
			for(int i = 0 ; i < six_pos ; i++){
				sum = sum +arr[i];	
			}
			for(int i = sev_pos+1 ; i < arr.length ; i++){
				sum = sum +arr[i];	
			}
		}
		else{
			for(int i=0;i<arr.length;i++){
				sum=sum+arr[i];
			}
		}
		System.out.println("The sum is : "+sum);
	}
} 