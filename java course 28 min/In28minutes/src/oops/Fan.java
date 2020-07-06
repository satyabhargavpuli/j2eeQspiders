package oops;

public class Fan {

	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speedLevel;
	
	public Fan(String make, double radius, String color) {
		super();
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	
	public void switchOn() {
		this.isOn=true;
		speedLevel((byte)4);
	}
	public void switchOff() {
		this.isOn=false;
		speedLevel((byte)0);
	}
	
	public void speedLevel(byte speed) {
		this.speedLevel= speed;
	}
	@Override
	public String toString() {
		return "Fan [make=" + make + ", radius=" + radius + ", color=" + color + ", isOn=" + isOn + ", speedLevel="
				+ speedLevel + "]";
	}
	
}
