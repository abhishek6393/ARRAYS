package arrays;

public class reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,6,3,4,8,7,9,11};
		int k=3;
		reverse(arr,k);

	}
	public static void reverse(int arr[],int k){
		k=k%arr.length;
		int n=arr.length;
		rev(arr,0,n-k-1);
		rev(arr,n-k,arr.length-1);
		rev(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	public static int []rev(int arr[],int i,int j){
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
	}

}
