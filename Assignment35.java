class Assignment35{
	public static void main(String args[]){
		int arr[][] = new int[3][3];
		int k = 0;
		if(args.length == 9){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[0].length;j++){
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
		}
		else{
			System.out.println("please enter 9 elements");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 

		int max=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(arr[i][j]>max){
					max=arr[i][j];
				}
			}
		}
		System.out.println("The max is : "+max);
	}
}