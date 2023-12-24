package leetCode;

import java.util.Arrays;

public class LongCorridor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfWays("SSPPSPS"));

	}
	static public int numberOfWays(String corridor) {
		char[] corr = corridor.toCharArray();
        int cnt = 0;
        for(char c1:corr){
            if(c1=='S')
            cnt++;
        }
        System.out.println(cnt);
        if(cnt == 0 || cnt%2 !=0) return 0;
        int c = 0;
        int ans = 1;
        for(int i=0; i<corr.length; i++){
            if(corr[i]=='S'){
                c++;
            }
            if(c==2){
                cnt = 1;
                i++;
                while(i<corr.length && corr[i]=='P'){
                    cnt++;
                    i++;
                }
                if(i == corr.length) break;
                ans = (ans*cnt) % 1000000007;
                c = 0;
                i--;
            }
        }
        return ans;
	    }
	    

}
