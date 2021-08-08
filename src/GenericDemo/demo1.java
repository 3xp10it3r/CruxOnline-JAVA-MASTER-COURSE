package GenericDemo;

import java.util.Comparator;

public class demo1 {

	public static void main(String[] args) {
		Car[] car = new Car[5];

		car[0] = new Car(2000, 100, "blue");
		car[1] = new Car(1800, 50, "red");
		car[2] = new Car(2400, 300, "yellow");
		car[3] = new Car(2500, 500, "green");
		car[4] = new Car(2100, 100, "white");

		bubbleSort(car,new CarSpeedComaparator());
		display(car);
		
		bubbleSort(car,new CarPriceComparator());
		display(car);
		bubbleSort(car,new CarColorComparator());
		display(car);
	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val + " ");
		}
		System.out.println();
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

	public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1 - counter; j++) {
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
	}

}
