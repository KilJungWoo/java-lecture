import javax.print.attribute.standard.PrinterName;

public class ScopeExample {
	
	static String name = "길정우 바보";
	
	public static void main(String[] args) {
		
		String name = "박은진";
		System.out.println(name);
		printName();
		
		
	}
	
	public static void printName() {
		
		System.out.println(name);
		
	}
}