
public class BitExample {

	public static void main(String[] args) {

		int a = 10;
		int b = 11;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		
		System.out.println(a | b);
		System.out.println(a & b);
		System.out.println(a ^ b);
		
		System.out.println(Integer.toBinaryString(-1));
		
		//Shift ¿¬»ê
		//>>,<<,>>>
		
		byte x = 10;
		
		System.out.println(" x >> 2 = " + (x >> 2));
		
		x = -10;
		System.out.println("-10 = " + Integer.toBinaryString(x));
		System.out.println("-10 >> 5" + Integer.toBinaryString(x >> 5));
		
		System.out.println("-10 << 5 =" + Integer.toBinaryString(x << 5));
		
		byte z = 1;
		System.out.println("1 << 7 =", z << 8);
		

	}

}
