
public class Truck extends Car {
      int weight;
      public Truck(int speed,double regularPrice,String color,int weight) {
    	  super(speed,regularPrice,color);
    	  this.weight = weight;
      }
      double getSalePrice() {
    	  if(weight>2000) {
    		  //System.out.println("10% discount");
    		  return super.regularPrice * 0.85;
    		  
    	  }
    	  else {
    		  return super.regularPrice * 0.75;
    	  }
      }
}
