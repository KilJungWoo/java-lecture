
public class LogicalExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 15;
		
		boolean result = (a != b) && (a < b);
		
		System.out.println(result && false);
	
		int c = 10;
		int d = 10;
		
		System.out.println((c > d) & (c++ == ++d));
		System.out.println("c = " + c + "," + "d = " + d);
        
		int x = 100;
		int y = 200;
		
		System.out.println(x != y || (x++ == y ++));
		System.out.println("x = " + x + "," + "d = " + d);
		
		
	}
}
