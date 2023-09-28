package arrays;

public class circular_sum_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,-2,-3,2};
		System.out.println(dnf(arr));

	}
	public static int dnf(int arr[]) {
		
		int temp=kd(arr);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			arr[i]=arr[i]*-1;
			
		}
		int temp2=kd(arr);
		int t=temp2+sum;
		int to=Math.max(temp, t);
		return to;
	}
	public static int kd(int arr[]) {
		int sum=0;
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		return ans;
		
	}

}
