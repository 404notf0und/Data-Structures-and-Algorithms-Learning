//From：https://mp.weixin.qq.com/s/b9Yu23zUrgtitnSp_tg3QQ
package test;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int result;
		result=binarySearch(arr,9);
		System.out.print(result);
	}
	public static int binarySearch(int[] arr,int data) {
		int min=0;
		int max=arr.length-1;
		int mid;
		while(min<=max) {
			//mid=(max+min)/2; //大数可能会溢出
			mid=min+(max-min)/2;//减法比较好
			//mid=min+((max-min)>>>1); //位运算
			if(arr[mid]>data) {
				max=mid-1;
			}else if(arr[mid]<data) {
				min=mid+1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
