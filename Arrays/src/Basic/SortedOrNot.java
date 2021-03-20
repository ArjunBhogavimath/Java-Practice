package Basic;

public class SortedOrNot {

	public static void main(String[] args) {
		int a[]= {2,3,1,9,5};
		
		boolean sort= true;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				sort =false;
				break;
			}
		}
		if(sort) {
			System.out.println("The array is sorted");
		}
		else {
			System.out.println("The array is not sorted");
		}

	}

}
