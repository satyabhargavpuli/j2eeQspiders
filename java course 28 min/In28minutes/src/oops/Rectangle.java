package oops;

public class Rectangle {

	private int length;
	private int breath;
	public Rectangle(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreath() {
		return breath;
	}
	public void setBreath(int breath) {
		this.breath = breath;
	}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breath=" + breath + " , area = "+area() + " , perimeter = "+perimeter()+ "]";
	}
	
	public int area() {
		return length * breath;
	}
	
	public int perimeter() {
		return 2 * area();
	}
	
}
