class Assignment33{
	public static void main(String args[]){
		int a[] = {1,2,3};
		int b[] = {4,5,6};
		int c[] = new int[2];
		
		c[0] = a[1];
		c[1] = b[1];
		
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
	}
}