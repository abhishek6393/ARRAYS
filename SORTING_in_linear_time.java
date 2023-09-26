package recursion;

public class SORTING_in_linear_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,0,1,2,0,2,1,0};
		print(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}

	}
	public static int[] print(int arr[]) {
		
		
		int right=arr.length-1;
		int left=0;
		int mid=0;
		while(mid<=right) {
			if(arr[mid]==2) {
				int temp=arr[right];
				arr[right]=arr[mid];
				arr[mid]=temp;
				right--;
			}
			else if(arr[mid]==0) {
				int tem=arr[left];
				arr[left]=arr[mid];
				arr[mid]=tem;
				left++;
				mid++;
			}
			else {
				mid++;
			}
		}
		return arr;
	}

}
