package dsaPractise.binarySearch;

import java.util.ArrayList;

public class PaintersPartition {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList();
		//10 20 30 40
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		int k = 2; //painters
		
		int ans = findLargestMinDistance(list, k);
		
//		You are supposed to return the area of the minimum time to get this 
//				job done of painting all the 'n' boards under a constraint that 
//				any painter will only paint the continuous sections of boards.
		
		System.out.println(ans);
	
	}

	public static int findLargestMinDistance(ArrayList<Integer> boards, int k) {
	
		int s=0 , e=0;
		 
		int sum=0;
		
		for (Integer integer : boards) {
			sum+=integer;
		}
		
		e=sum;
		
		int ans=-1;
		
		while(s<=e) {
			int mid = s +(e-s)/2;
			if(isPossible(boards, k ,mid)) {
				ans = mid;
				e = mid-1;
			}
			else {
				s = mid+1;
			}
		}
		
		return ans;
	}

	private static boolean isPossible(ArrayList<Integer> boards, int k, int mid) {

		int countPainter = 1;
		int boardsSum = 0;
		
		for(int i=0; i<boards.size(); i++) {
			if(boardsSum + boards.get(i) <= mid) {
				boardsSum += boards.get(i) ;
				
			}
			else {
				countPainter++;
				
				if(countPainter > k || boards.get(i)>mid) {
					return false;
				}
				
				boardsSum = boards.get(i);
			}
		}
		
		return true;
	}

}
