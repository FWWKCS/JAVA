import java.util.Scanner;
public class PrintAlphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오 >> ");
		String letter = input.next();
		char c = letter.charAt(0); // 문자열의 첫번째 문자
		
		for (int i = c; i >= (byte)('a'); i--) {
			for (int j='a'; j <= i; j++) {
				System.out.print((char)(j));
			}
			System.out.println();
		}
		
		input.close();
	}
}
