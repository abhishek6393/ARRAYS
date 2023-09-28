package home_work;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {5,9,6,3,7,2,1,21,41,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int[]sort(int arr[]){
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int tem=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=tem;
				}
			}
		}
		return arr;
	}

}
