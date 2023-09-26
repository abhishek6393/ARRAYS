package recursion;

public class max_circular_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {-3,-2,-3};
		System.out.println(print(arr));

	}
	public static int kd(int arr[]) {
		
		int ans=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum=0;
			}
		}
		
		return ans;
	}
	
	public static int print(int arr[]) {
		int temp=kd(arr);
	
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
			arr[i]=arr[i]*-1;
			
		}
		
		
		int tem2=kd(arr);
		
		int g=tem2+sum1;
		
		int t=Math.max(temp, g);
		if(g==0) {
			t=temp;
		}
		return t;
	}

}
