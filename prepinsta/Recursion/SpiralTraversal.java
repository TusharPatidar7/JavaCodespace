package prepinsta.Recursion;

public class SpiralTraversal {
	static int R = 4;
	static int C = 4;

	public static void main(String[] args) {
		int a[][] = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12 }, 
				{ 13, 14, 15, 16 } };

		print(a, 0, 0, R-1, C-1);
	}
	static void print(int[][] a, int start, int left, int right, int end) {
		
		while(start<end) {
			for(int j=left; j<=right; j++) {
				System.out.print(a[start][j]+" ");
			}
			start++;
			for(int i=start; i<=end; i++) {
				System.out.print(a[i][right]+" ");
			}
			right--;
			for(int j=right; j>=left; j--) {
				System.out.print(a[end][j]+" ");
			}
			end--;
			for(int i=end; i>=start; i--) {
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
}
