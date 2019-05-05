//From:http://michael282694.com/post/2018.08qiu-zhi-mian-jing
//topk问题,找出乱序数组中第k大的数
package test;

public class TopK {
	public static void main(String[] args) {
		int[] arr= {1,21,3,40,5,61,7,8,10};
		int k=4;
		topkByPartition(arr,0,arr.length-1,k);
	}
	public static void topkByPartition(int arr[],int low,int high,int k) {
		int l=low;
		int r=high;
		int p=getPartition(arr,l,r);
		while(p!=k) {
			if(p<k) {
				l=p+1;
			}else {
				r=p;
			}
			p=getPartition(arr,l,r);
		}
		System.out.print(arr[p]);
	}
	private static int getPartition(int[] arr,int left,int right) {
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
