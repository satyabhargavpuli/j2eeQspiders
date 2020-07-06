package interview;

public class OverloadedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //show(null); if we call show(null) we get ambigious error and also if we change the methods to static
		//then it prints without overloaded methods
	}
	public void show(Object o) {
		System.out.println("object ()");
	}
	public void show(String o) {
		System.out.println("String ()");
	}
	public void show(StringBuffer o) {
		System.out.println("StringBuffer ()");
	}

}
