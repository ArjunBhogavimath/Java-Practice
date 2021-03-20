package majority_Element;

public class SubArrayKaden {

	public static void main(String[] args) {
		int arr[] =  {-5,4,6,-3,4,1};
		subArray(arr);
		System.out.println("The Maximum subarray sum : "+kadenSubArray(arr));

	}
	//wrong
	static void subArray(int arr[]) {
		int n = arr.length;
		int max= Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			int sum =0;
			for(int j=i;j<n;j++) {
				sum = arr[i]+arr[j];
			}
			if(sum>max) {
				max=sum;
			}
		}
		System.out.println(max);
	}
//Kaden's algorithm Time O(n) space O(1)
	
	static int kadenSubArray(int arr[]) {
		int max = 0;
		int cur_sum = 0;
		for(int i =0;i<arr.length;i++) {
			cur_sum+=arr[i];
			if(cur_sum>max) {
				max = cur_sum;
			}
			if(cur_sum<0) {
				cur_sum=0;
			}
		}
		return max;
	}
}
