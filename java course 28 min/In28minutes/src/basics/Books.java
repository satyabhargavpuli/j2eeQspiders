package basics;

public class Books {
public static void main(String[] args) {
	Book artOfComputerProgramming = new Book();
	Book effectiveJava = new Book();
	Book cleanCode = new Book();
	
	artOfComputerProgramming.setArtOfComputerProgramming("its me");
	cleanCode.setCleanCode("super clean");
	
	System.out.println(cleanCode.getCleanCode());
}
}
