class Assignment30{
	public static void main(String args[]){
		int arr[]={1,10,5,6,10,7,10};
		int arr1[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=10){
				arr1[j]=arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr1[i]+" ");
		}
	}
}