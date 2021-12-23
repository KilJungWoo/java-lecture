
public class CompareExample {

	public static void main(String[] args) {
		
		int a = 10; 
		int b = 20;
		
		System.out.println("a < b = " + (a < b));
		System.out.println("a > b = " + (a > b));
		System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        
        boolean result = (a >= b);
        
        System.out.println(result);
        
        System.out.println("!(a > b)" + !(a > b));
        
        System.out.println(" a == b " + (a==b));
        
        System.out.println(" a != b" + (a !=b));
        
	}

}
