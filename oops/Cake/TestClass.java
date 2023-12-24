package oops.Cake;

public class TestClass {
	public static void main(String[] args) {
		Cake cake = new Cake();
		cake.setPrice(29.99);
		System.out.println("Cake Flavor: "+cake.getFlavor());
		System.out.println("Cake Price: "+cake.getPrice());
		
		BirthdayCake bCake = new BirthdayCake();
		System.out.println("Birthday Cake Flavor: "+bCake.getFlavor());
		System.out.println("Birthday Cake Price: "+bCake.getPrice());
		
		WeddingCake wCake = new WeddingCake();
		wCake.setFlavor("pina colada");
		wCake.setPrice(350);
		System.out.println("Wedding Cake Flavor: "+wCake.getFlavor());
		System.out.println("Wedding Cake Price: "+wCake.getPrice());
	}
}
