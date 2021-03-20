package Basic;

public class MaxEle {

	public static void main(String[] args) {
		int arr[]= {20,30,10,55,67,2};
		
		int max=Integer.MIN_VALUE;
		
		for(int ele : arr) {
			if(ele>max) {
				max=ele;
			}
			
		}
		System.out.println("The max value in array is : "+max);

	}

}




//Integer.MAX_VALUE FOR max value in integer
//Integer.MIN_VALUE FOR min value in integer