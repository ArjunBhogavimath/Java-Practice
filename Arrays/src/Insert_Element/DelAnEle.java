package Insert_Element;

public class DelAnEle {
	static int count =5;
	public static void main(String[] args) {
		int a[] =  new int[5];
		int val=19;
		
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		System.out.println("The original array is : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		delAtEnd(a);
		System.out.println("After Deleting an Element at end : ");
		for(int i=0;i<count;i++) {
			System.out.print(a[i]+" ");
		}

	}
	
	static void delAtEnd(int a[]) {
		if(a.length<=0)
			return;
		count--;
	}
	
	static void delaVal(int a[],int val) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==val)
				break;
		}
	}
}
