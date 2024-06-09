import java.util.Arrays;
class Assignment27{
	public static void main(String args[]){
		int arr[] = {20,35,1,7,3,57,36,49};
		
		Arrays.sort(arr);
		for( int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}