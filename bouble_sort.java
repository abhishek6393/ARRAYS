package home_work;
import java.util.*;

public class bouble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,9,6,3,7,2,1,21,41,4};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int[]sort(int arr[]){
		for(int j=1;j<arr.length;j++) {
			
		
		
		for(int i=0;i<arr.length-j;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		
	}
		return arr;
	}

}
