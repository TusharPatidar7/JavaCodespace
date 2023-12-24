package leetCode;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] findDiagonalOrder(List<List<Integer>> nums) {
        
        List<Integer> list = new ArrayList<Integer>();
        int total=0;
        int counter = 0;
        
        for (List<Integer> l : nums) {
			for(Integer i: l) {
				total++;
			}
		}
        
        for(int i=0; i<nums.size(); i++)
        {
            list.add(nums.get(i).get(0));
            int j=i-1;
            int k = 1;
            while(j>=0){
                if(k < nums.get(j).size()){
                    list.add(nums.get(j).get(k));
                }
                j--;
                k++;
                counter++;
            }            
        }
        while(counter <= counter) {
        	int j=nums.size()-1;
            int k = 1;
            while(j>=0){
                if(k < nums.get(j).size()){
                    list.add(nums.get(j).get(k));
                }
                j--;
                k++;
                counter++;
            }    
        }

        int ans[] = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }

}
