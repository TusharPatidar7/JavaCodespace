package oops.Cake;

public class BirthdayCake extends Cake {
	
	private int candles;

	BirthdayCake(){
		super("Chocolate");
	}

	public int getCandles() {
		return candles;
	}

	public void setCandles(int candles) {
		this.candles = candles;
	}
	
}
