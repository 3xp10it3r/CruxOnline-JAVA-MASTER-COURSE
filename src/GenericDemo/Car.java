package GenericDemo;

public class Car { //implements Comparable<Car> {

	int speed;
	int price;
	String color;

	public Car(int speed, int price, String color) {
		this.speed = speed;
		this.price = price;
		this.color = color;
	}

	@Override
	public String toString() {
		return " Speed: " + this.speed + " price: " + this.price + " color: " + this.color;
	}

//	@Override
//	public int compareTo(Car o) {
////		return o.speed - this.speed;
//		return this.color.compareTo(o.color);
//	}
}
