package Basic;


//program to find a integer present in a array or not

public class Q1 {

	public static void main(String[] args) {
		int a[]= {1,20,30,45,2};
		
		boolean isPresent = false;
		int n= 30;
		
		for(int e:a) {
			if(n==e)
				isPresent = true;
				break;
			
		}
		  
		System.out.println(isPresent);
		

	}

}
