package Insert_Element;

public class InsertEle {

	public static void main(String[] args) {
		int a[] =  new int[5];
		int val=19;
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+1;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		insertAtFirst(a,val);
		
		System.out.println("After Inserting an element in the begining : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		insertAtLast(a,val);
		
		System.out.println("After Inserting an element at last : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
		insertAtPos(a,2,val);
		
		System.out.println("After Inserting an element at Position : ");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}
	
	static void insertAtFirst(int a[],int val) {
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		
		a[0] = val;
	}
	
	static void insertAtLast(int a[],int val) {
		int last=a.length-1;
		
		a[last]=val;
		}
	
	static void insertAtPos(int a[],int pos,int val) {
		for(int i=a.length-1;i>pos;i--) {
			a[i]=a[i-1];
		}
		a[pos]=val;
	}
	

}
