package oops.Cake;

public class Cake {
	private String flavor = "Vanilla";
	private double price;
	
	Cake(){
		this("Vanilla");
	}
	Cake(String flavor){
		this.flavor = flavor;
		this.price = 9.99;
	}
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
