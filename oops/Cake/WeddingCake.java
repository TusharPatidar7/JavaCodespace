package oops.Cake;

public class WeddingCake extends Cake{
	private int tiers;

	WeddingCake() {
		super("Chocolate");
	}

	public int getTiers() {
		return tiers;
	}

	public void setTiers(int tiers) {
		this.tiers = tiers;
	}

}
