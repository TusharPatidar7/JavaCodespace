package leetCode;

public class P2038 {
	/*
 Alice is only allowed to remove a piece colored 'A' if both its neighbors are also colored 'A'.
 She is not allowed to remove pieces that are colored 'B'.
 
Bob is only allowed to remove a piece colored 'B' if both its neighbors are also colored 'B'. 
He is not allowed to remove pieces that are colored 'A'.

Alice and Bob cannot remove pieces from the edge of the line.
If a player cannot make a move on their turn, that player loses and the other player wins.
Assuming Alice and Bob play optimally, return true if Alice wins, or return false if Bob wins.
	 */

	public boolean winnerOfGame(String colors) {
        
		if(colors.length()<3) return false;
        int a=0;
        int b=0;
        
        char[] col=colors.toCharArray();
        int l=col.length;
        int i=1;
        while(i<l-1) {
        	
        	if(col[i]==col[i-1] && col[i]==col[i+1]) {
        		if(col[i]=='A') {
        			a++;
        		}
        		else {
        			b++;
        		}
        	}
        	i++;
        }
        if(a>b){return true;}
        else return false;
	
	}
		
	public static void main(String[] args) {
		
		System.out.println(new P2038().winnerOfGame("AAABABB"));
	}

}
