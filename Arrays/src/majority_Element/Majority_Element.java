package majority_Element;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Majority element in an array which repeats more than n/2 times 

public class Majority_Element {

	public static void main(String[] args) {
		
		int arr[]= {1,4,4,3,4};
		
		majorityBruteF(arr);
		majorityUsingSorting(arr);
	}
	//Brute Force solution which takes O(n^2) time complexity and O(1) space Complexity.
	static void majorityBruteF(int arr[]) {
		int N = arr.length;
		int half = N/2;
		int max=0;
		int index=-1;
		for(int i=0;i<N;i++) {
			int count =0;
			for(int j=0;j<N;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(max<count) {
				max=count;
				index=i;
			}
		}
		if(max>half)
			System.out.println("Majority Elements brute force : "+arr[index]);
		else
			System.out.println("No Majority Element found in the array");
	}
	//using sorting it will make the time complexity as O(nlogn) and space O(1)
	//the code is little wrong
	static void majorityUsingSorting(int arr[]) {
		Arrays.sort(arr);
		int n = arr.length;
		int count =0;
		int max = 0;
		int half = n/2;
		int index =-1;
		for(int i=0;i<n-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				index=i;
			}
			if(max<count)
				max=count;
			index=i;
		}
		
		if(max>half)
			System.out.println("Majority Elements brute force : "+arr[index]);
		else
			System.out.println("No Majority Element found in the array");
	}
	
//Using hashmap with O(n) time and O(n) space
	
	static void majorityUsingHash(int arr[]) {
		Map<Integer,Integer> map = new HashMap<>();
		
	}
	
	
//Using moore's voting algorithm
	
	//static void 
}


