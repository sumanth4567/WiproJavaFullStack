class Assignment31{
	public static void main(String args[]){
		int arr[]={0,1,2,3,4,5,6,7,8,9};
		int arr1[]=new int[10];
		int j =0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" " );
		}
	}
}