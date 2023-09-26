package home_work;

public class next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,1};
		int brr[]=print(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(brr[i]+" ");
		}

	}
	public static int[] print(int arr[]) {
		int index1=0;
		int index2=0;
		for(int  i=arr.length-2;i>=0;i--) {
			if(arr[i+1]>arr[i]) {
				index1=i;
				break;
			}
			
		
		}
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>arr[index1]) {
				index2=i;
				break;
			}
			
		
			
			
		}
		if(index1==0&&index2==0) {
			rev(arr,0,arr.length-1);
			return arr;
			
		}
		int tem=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=tem;
		int i=index1+1;
		int j=arr.length-1;
		rev(arr,i,j);
		return arr;
		
	}
	public static int []rev(int arr[],int i,int j)
	{
		while(i<=j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		return arr;
		
		
	}
}
