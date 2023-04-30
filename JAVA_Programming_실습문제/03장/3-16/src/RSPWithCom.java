import java.util.Scanner;
import java.util.Random;
public class RSPWithCom {
	static void Check(String val, String com) {
		if (val.equals("가위")) {
			if (com.equals("가위")) 
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 비겼습니다");
			else if (com.equals("바위"))
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 컴퓨터가 이겼습니다");
			else // 컴퓨터 : 보
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 사용자가 이겼습니다");
		}
		else if (val.equals("바위")) {
			if (com.equals("가위")) 
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 사용자가 이겼습니다");
			else if (com.equals("바위"))
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 비겼습니다");
			else // 컴퓨터 : 보
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 컴퓨터가 이겼습니다");
		}
		else if (val.equals("보")) {
			if (com.equals("가위")) 
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 컴퓨터가 이겼습니다");
			else if (com.equals("바위"))
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 사용자가 이겼습니다");
			else // 컴퓨터 : 보
				System.out.println("사용자 : "+val+", 컴퓨터 : "+com+", 비겼습니다");
		}
		else {
			System.out.println("잘못 입력했습니다");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		
		String str[] = {"가위","바위","보"};
		
		while (true) {
			System.out.print("가위 바위 보 >> ");
			String val = input.next();
			if (val.equals("그만"))
				break;
			
			int n = (int)(Math.random()*3); // 컴퓨터가 선택한 RSP 배열의 인덱스
			
			Check(val, str[n]);
			
		}
		input.close();
	}
}
