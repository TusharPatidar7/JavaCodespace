package leetCode;

import java.util.ArrayList;

public class SeatManager {

	//we should use priority queue for better performance
	ArrayList<Integer> list;
	ArrayList<String> ans;
	
	
	public SeatManager(int n) {
		list = new ArrayList<Integer>();
		ans = new ArrayList<String>();
        ans.add(null);
    }
    
    public int reserve() {
    	int i=0;
    	
    	if(list.isEmpty()) {
    		list.add(1);
    		return 1;
    	}
    	else {
    		list.forEach(seat->{
    			int count=0;
    			if(seat==null && count==0) {
    				seat = list.indexOf(seat)+1;
    				ans.add(seat+"");
    				count++;
    			}
    		});
    	}
    	for(Integer seat : list) {
    		if(seat==null) {
    			list.add(i, ++i);
        		ans.add(i+"");
        		break;
        	}
        	i++;
    	}
//        for(int seat : seatRecords) {
//        	if(seat == 0) {
//        		seatRecords[i] = ++i;
//        		ans.add(i+"");
//        		break;
//        	}
//        	i++;
//        }
        
        return i;
    }
    
    public void unreserve(int seatNumber) {
    	if(seatNumber>0) {
    	list.remove(seatNumber);
    	list.add(seatNumber, null);
    	
    	}
//        seatRecords[seatNumber-1] = 0;
        ans.add(null);
    }
    public static void main(String[] args) {
//    	["SeatManager", "reserve", "reserve", "unreserve", "reserve", "reserve", "reserve", "reserve", "unreserve"]

    	SeatManager m = new SeatManager(5);
    	
    	m.reserve();
    	m.reserve();
    	m.unreserve(2);
    	m.reserve();
    	m.reserve();
    	m.reserve();
    	m.reserve();
    	m.unreserve(5);
    	
    	System.out.println(m.ans);
	}
}
