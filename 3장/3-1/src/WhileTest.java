
public class WhileTest {
	public static void main(String[] args) {
		int sum = 0, i = 0;
		// while 이용
//		while (i<100) {
//			sum = sum + i;
//			i += 2;
//		}
		
		// for 이용
//		for ( ; i<100; i+=2) {
//			sum = sum + i;
//		}
		
		// do-while 이용
		do {
			sum = sum + i;
			i += 2;
		} while (i < 100);
		System.out.println(sum);
	}
}
