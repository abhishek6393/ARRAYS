package arrays;

public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,3,4,8,7,9,11};
		int k=3;
		reverse(arr,k);

	}
public static void reverse(int arr[],int k) {
	
	int n=arr.length;
	for(int j=1;j<=k;j++) {
	k=k%n;
	int temp=arr[n-1];
	for(int i=n-2;i>=0;i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	
}
}
