package home_work;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,9,6,3,7,2,1,21,41,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
public static int []sort(int arr[]){
	
	for(int i=0;i<arr.length;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[min]) {
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
	return arr;
	
}
}
