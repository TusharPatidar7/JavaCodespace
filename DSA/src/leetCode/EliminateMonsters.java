package leetCode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class EliminateMonsters {
//Track the arrival time of each monster ans sort the array then start eliminating 
	public static void main(String[] args) {

		//dist = [1,3,4], speed = [1,1,1]
		
		int[] dist = {3,2,4};
		int[] speed = {5,3,2};
		
		int ans = EliminateMonsters.eliminateMaximum(dist, speed);
		
		System.out.println(ans);
	}
	
	public static int eliminateMaximum(int[] dist, int[] speed) {
	    int n = dist.length;

			for(int i=0; i<n; i++){
				dist[i] = (dist[i]-1)/speed[i];
			}
			Arrays.sort(dist);
			for(int i=0; i<n; i++) {
				if(i>dist[i])
				return i;
			}		
			return n;
	    }

	//Only few test case passed
	static public int eliminateMaximum2(int[] dist, int[] speed) {

		int n = dist.length;
		int count = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<n; i++) {
			count++;
			for(int j=i+1; j<n; j++ ) {
				dist[j] = dist[j] - speed[j];
				if(dist[j] == 0) return count;
			}
		}
		
		return n;
	}

}
