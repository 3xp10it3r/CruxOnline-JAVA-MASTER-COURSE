package GenericDemo;

import java.util.Comparator;

public class CarSpeedComaparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		return tcar.speed - ocar.speed;
	}

}
