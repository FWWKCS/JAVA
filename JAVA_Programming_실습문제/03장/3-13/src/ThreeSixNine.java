
public class ThreeSixNine {
	public static void main(String[] args) {
		int num = 1;
		int ten = -1; // 10의 자리수
		int one = -1; // 1의 자리수
		while (num <= 99) {
			if (num >= 10) 
				ten = num / 10;
			one = num % 10;
			
			if (ten == 3 || ten == 6 || ten == 9) {
				if (one == 3 || one == 6 || one == 9) 
					System.out.println(num+" 박수 짝짝");
				else 
					System.out.println(num+" 박수 짝");
			}
			else {
				if (one == 3 || one == 6 || one == 9) 
					System.out.println(num+" 박수 짝");
			}
			num++;
		}
	}
}
