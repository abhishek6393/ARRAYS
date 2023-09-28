package arrays;

public class nex_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,2,1};
		permutation(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int []permutation(int arr[]){
		int index1=0;
		int index2=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i+1]>arr[i]) {
				index1=i;
				break;
			}
		}
			for(int i=arr.length-1;i>=0;i--) {
				if(arr[index1]<arr[i]) {
					index2=i;
					break;
				}
			
		}
			if(index1==0&& index2==0) {
				swap(arr,0,arr.length-1);
				return arr;
				
			}
			
			int temp=arr[index1];
			arr[index1]=arr[index2];
			arr[index2]=temp;
			
			int i=index1+1;
			int j=arr.length-1;
			swap(arr,i,j);
			return arr;
			
	}
	public static int []swap(int arr[],int i,int j){
		while(i<=j) {
			int tem=arr[i];
			arr[i]=arr[j];
			arr[j]=tem;
			i++;
			j--;
		}
		return arr;
	}

}
