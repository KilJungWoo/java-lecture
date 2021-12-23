
public class TypeCastingExample {

	public static void main(String[] args) {
		
		int a = 10; // 4 bytes
		short b = (short)a; // 2 bytes

		
		short c = 100; // 2 bytes
		int d = c; // 4 bytes
		
		
		
		int a1 = 128;
		byte x1 = (byte)a1; // 쓰레기값이 들어감 (-128)
	}

}
