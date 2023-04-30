import java.util.Scanner;
import java.util.Random;

public class UpAndDown {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String start = "y";
		
		while (start.equals("y") || start.equals("Y")) {
			int value = -1; // 입력값
			int count = 0;
			int up = 0;
			int down = 99;
			
			Random r = new Random();
			int k = r.nextInt(100); // 0~99까지 임의의 정수 생성
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			// 게임을 맞출때까지 반복진행
			while (value != k) {
				// 일치하면 반복문 나오기
				count += 1;
				System.out.println(up+"-"+down);
				System.out.print(count+"차 시도 >> ");
				value = input.nextInt();
				
				if (value > k) {
					System.out.println("더 낮게");
					if (value > down) 
						continue;
					else if (value < down) 
						down = value;
				}
				else if (value < k) {
					System.out.println("더 높게");
					if (value < up) 
						continue;
					else if (value > up)
						up = value;
				}
				
			}
			
			System.out.println("맞았습니다.");
			System.out.print("다시하시겠습니까 (y/n) >> ");
			start = input.next();
		}
		
		input.close();
	}
}
