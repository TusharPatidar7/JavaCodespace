package dsaPractiseArrays;

public class TwoD {

	static void mul() {
		int A[][] = {{1 ,2},{2,1}};
		int B[][] = {{1,2,3},{2,3,1}};
		int r1 = A.length;
		int c1 = A[0].length;
		int r2 = B.length;
		int c2 = B[0].length;
		int C[][] = new int[r1][c2];
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<c1; k++) {
					C[i][j]+=(A[i][k]*B[k][j]);
				}
				
			}
		}
		new TwoD().print2D(C);
	}
	
	void print2D(int arr[][]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		TwoD.mul();
	}
	
}
