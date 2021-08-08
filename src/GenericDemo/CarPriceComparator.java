package GenericDemo;

import java.util.Comparator;

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		return ocar.price - tcar.price;
	}

}
