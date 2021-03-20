package Basic;

//Reverse an array with space complexity o(1)


public class RevArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int l=arr.length;
		int len = Math.floorDiv(l, 2);
		
		for(int i=0;i<len;i++) {
			int temp=arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		
		for(int element:arr) {
			System.out.print(element+" ");
		}
		

	}

}
