
public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sedan sedan1 = new Sedan(75,50000,"brown",25);
		Ford ford1 = new Ford(65,25000,"silver",2016,25);
		Ford ford2 = new Ford(60,20000,"white",2017,35);
		
		Car car = new Car(60,40000,"black");
		
		System.out.println("Regular price for Sedan1 is "+ sedan1.getSalePrice());
		System.out.println("Regular price for Ford1 is "+ ford1.getSalePrice());
		System.out.println("Regular price for Ford2 is "+ ford2.getSalePrice());
		System.out.println("Regular price for car is "+ car.getSalePrice());
		

	}

}

