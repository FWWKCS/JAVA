import java.util.Scanner;
public class DallarToWon {
	public static void main(String[] args) {
		Scanner cost = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원) >> ");
		int won = cost.nextInt();
		System.out.println(won+"원은 $"+(float)won/1100+"입니다.");
		
		cost.close();
	}
}
