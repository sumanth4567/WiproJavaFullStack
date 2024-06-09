class Assignment34{
	public static void main(String args[]){
		int arr[][] = new int[2][2];
		int k = 0;
		if(args.length == 4){
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr[0].length;j++){
					arr[i][j]=Integer.parseInt(args[k]);
					k++;
				}
			}
		}
		else{
			System.out.println("please enter 4 elements");
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		} 
	}
}