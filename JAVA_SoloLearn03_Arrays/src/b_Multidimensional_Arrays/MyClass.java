package b_Multidimensional_Arrays;

public class MyClass {

	public static void main(String[] args) {
		
		int[][] sample = {{1, 2, 3}, {4, 5, 6}};
		
		int x = sample[1][0];
		System.out.println(x);
		// Outputs 4
		
		
		
		int[][] myArr = {{1, 2, 3}, {4}, {5, 6, 7}};
		myArr[0][2] = 42;
		int y = myArr[1][0];	//4
		

	}

}
