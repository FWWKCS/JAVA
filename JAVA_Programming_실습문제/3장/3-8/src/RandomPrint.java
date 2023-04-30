import java.util.Scanner;
import java.util.Random;

public class RandomPrint {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력 (1~100) >> ");
		int count = input.nextInt();
		
		int n[] = new int[count];
		boolean duplication = false; // 숫자 중복 여부
		
		for (int i=0; i<count; i++) {
			duplication = false;
			int r = (int)(Math.random()*100+1);
			for (int value : n) {
				if (r == value) { 
					// System.out.println("중복값 존재"+value+"는 이미 배열 n에 있음");
					duplication = true;
					break;
				}
			}
			if (duplication) {
				i--;
				continue;
			}
			else {
				n[i] = r;				
			}
		}
		
		// 10개씩 나눠 출력
		for (int i=0; i<count; i++) {
			if (i != 0 && i%10 == 0)
				System.out.println();
			System.out.print(n[i]+" ");
		}
		input.close();
	}
}
