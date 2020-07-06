package bikerzzzz;

public class DiffBikes {

	public static void main(String[] args) {
		Bike enfield = new Bike(100);
		Bike unicorn = new Bike(200);
		enfield.setSpeed(100);
		enfield.start();
		
		enfield.increaseSpeed(100);
		enfield.decreaseSpeed(-20);
		/*
		 * // int speedIncrease = enfield.getSpeed(); // speedIncrease =
		 * speedIncrease+100; // enfield.setSpeed(speedIncrease); // // int
		 * hondaSpeedIncr = unicorn.getSpeed(); // hondaSpeedIncr+=100; //
		 * unicorn.setSpeed(hondaSpeedIncr);
		 */		System.out.println(enfield.getSpeed());
		//System.out.println(unicorn.getSpeed());
		 System.out.println();
	}
}
