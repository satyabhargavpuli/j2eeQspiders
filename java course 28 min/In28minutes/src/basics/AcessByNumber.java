package basics;

public class AcessByNumber {
public static void main(String[] args) {
	BiNumber number = new BiNumber(4, 8);
	System.out.println(number.add());
	System.out.println(number.sub());
	System.out.println(number.mul());
	number.doubleNum();
	System.out.println(number.getNumber1());
	System.out.println(number.getNumber2());
}
}
