package bikerzzzz;

public class Bike {
private int speed;
	
 public Bike(int speed) {
	 this.speed=speed;
 }
	public void setSpeed(int speed) {
		if(speed>0)
		this.speed = speed;
	}
		public int getSpeed() {
			return this.speed;
		}
	public void increaseSpeed(int increasePower) {
		this.speed+=increasePower;
	}
	
	public void decreaseSpeed(int decreasePower) {
 		 if((decreasePower>0 && !(decreasePower<0))) {
 			setSpeed(this.speed -= decreasePower);

		 }else 
		 
		 System.out.println("error please enter only positive value while decreasing speed");

	}
	void start() {
		System.out.println("bike is moving");
	}
}
