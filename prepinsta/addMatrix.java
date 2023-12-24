package prepinsta;

public class addMatrix 
{
	int [][] add(int [][]a1,int [][]b1)
	{
		if(a1.length!=b1.length || a1[0].length!=b1[0].length)
			throw new IllegalArgumentException("Arrays Dimensions should be same");
		else
		{
		int [][] result = new int [a1.length][b1[1].length];
		
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[1].length;j++)
			{
				result[i][j]=a1[i][j]+b1[i][j];
			}
		}
		
		return result;
		}
	}
	
	public static void main(String[] args) {
		int [][] a = {{1,2,3},{3,2,1}};
		int [][] b = {{2,2,2},{3,3,3}};
		
		int [][] result = new addMatrix().add(a,b);
	
		for(int i=0;i<result.length;i++)
		{
			for(int j=0;j<result[1].length;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}
