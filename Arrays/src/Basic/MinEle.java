package Basic;

public class MinEle {

	public static void main(String[] args) {
		int arr[]= {20,30,10,55,67,2};
		
		int min=Integer.MAX_VALUE;
		
		for(int ele : arr) {
			if(ele<min) {
				min=ele;
			}
			
		}
		System.out.println("The min value in array is : "+min);

	}

}
