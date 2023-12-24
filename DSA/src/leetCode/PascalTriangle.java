package leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(new PascalTriangle().getRow(3));

	}
	
	public List<Integer> getRow(int rowIndex) {
        int [][] arr = new int[rowIndex+1][rowIndex+1];
        List<Integer> list = new ArrayList<Integer>();
     
        if(rowIndex==0){
            list.add(1);
            return list;
        }
        arr[1][0] = 1;
        arr[1][1] = 1;

        for(int i=2; i<rowIndex+1; i++){
        	int j;
            arr[i][0] = 1;
          
            
            for( j=1; j<rowIndex; j++){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
               
            }
            arr[i][j]=1;
           
        }
        for(Integer i:arr[rowIndex] ) {
        	list.add(i);
        }
        return list;
    }
	
	public List<Integer> getRowNew(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long ans = 1;

        for(int i = 0;i<=rowIndex;i++){
            row.add((int)ans);
            ans = ans*(rowIndex-i);
            ans = ans/(i+1);
        }
        
        return row;
    }

}
