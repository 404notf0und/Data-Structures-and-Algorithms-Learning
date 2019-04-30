//分治思想下的快速排序，来源于：https://mp.weixin.qq.com/s/paOrlfpdMwvCUDywda0EvQ
package test;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,4,3,2,7,9,1,8,5};
		quickSort(arr,0,arr.length-1);
		printArr(arr);
	}
	private static void quickSort(int[] arr,int left,int right) {
		if(arr==null||left>=right||arr.length<=1)
			return;
		int mid=partition(arr,left,right);
		quickSort(arr,left,mid);
		quickSort(arr,mid+1,right);
	}
	private static void printArr(int[] arr) {
		for(int anArr:arr) {
			System.out.print(anArr+" ");
		}
	}
	private static int partition(int[] arr,int left,int right) {
		int temp=arr[left];
		while(right>left) {
			while(temp<=arr[right]&&left<right) {
				--right;
			}
			if(left<right) {
				arr[left]=arr[right];
				++left;
			}
			while(temp>=arr[left]&&left<right) {
				++left;
			}
			if(left<right) {
				arr[right]=arr[left];
				--right;
			}
		}
		arr[left]=temp;
		return left;
	}

}
