package oops;

public class FanImpl {
  public static void main(String[] args) {
	Fan fan = new Fan("orient",0.3456,"blue");
	
	fan.speedLevel((byte)0);
	System.out.println(fan);
	
	
}
}
