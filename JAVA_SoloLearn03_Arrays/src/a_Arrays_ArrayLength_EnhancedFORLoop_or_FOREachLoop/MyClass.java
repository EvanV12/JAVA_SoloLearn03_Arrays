package a_Arrays_ArrayLength_EnhancedFORLoop_or_FOREachLoop;

public class MyClass {

	public static void main(String[] args) {

		int[] arr =  new int[5];
		arr[2] = 42;


		String[] myNames = {"A", "B", "C", "D"};
		System.out.println(myNames[2]);
		// Outputs "C"



		int[] intArr = new int[5];
		System.out.println(intArr.length);
		// Outputs 5



		int[] myArr = {6, 42, 3, 7};
		int sum = 0;
		for (int x=0; x<myArr.length; x++) {
			sum += myArr[x];
		}
		System.out.println(sum);
		// Outputs 58

		

		int[] primes = {2, 3, 5, 7};

		for (int t: primes) {
			System.out.println(t);
		}
		/*
		 Outputs
		 2
		 3
		 5
		 7
		 */

	}

}
