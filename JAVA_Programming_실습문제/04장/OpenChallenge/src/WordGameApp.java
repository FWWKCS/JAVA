import java.util.Scanner;

// 플레이어 객체생성
class Player {
	String name;
	public String getWordFromUser(Scanner input) {
		return input.next();
	}
	public boolean checkSuccess(String player, char firstChar, char beforeLastChar) {
		if (firstChar == beforeLastChar) {
			// 올바르게 답했으면 true
			return true;
		}
		// 틀렸으면 false
		System.out.println(player+"이(가) 졌습니다");
		return false;
	}
}

public class WordGameApp {
	// 게임 시작 메소드
	static void run(Player p[], Scanner input) {
		System.out.println("시작하는 단어는 \'아버지\'입니다");
		String word = "아버지";
		int lastIndex = word.length() -1;
		char lastChar = word.charAt(lastIndex); // 마지막 글자
		char firstChar = word.charAt(0); // 첫번째 글자
		int turn = 0; // 차례
		
		boolean game = true;
		while (game) {
			if (turn == p.length)
				turn = 0;
			System.out.print(p[turn].name + " >> ");
			word = p[turn].getWordFromUser(input);
			// 입력받은 word의 첫글자를 이전 단어 마지막 글자와 비교하는 메서드 호출
			firstChar = word.charAt(0); // 입력받은 단어로 초기화
			boolean pass = p[turn].checkSuccess(p[turn].name, firstChar, lastChar);
			if (pass == true) {
				lastIndex = word.length() -1;
				lastChar = word.charAt(lastIndex);
				turn += 1;
			}
			else {
				break;
			}
		}
	}
	public static void main(String[] args) {
		// 참가자 확인
		Scanner input = new Scanner(System.in);
		
		System.out.println("끝말잇기 게임을 시작합니다.");
		System.out.print("게임에 참가하는 인원을 몇 명입니까 >> ");
		int count = input.nextInt();
		Player p[] = new Player[count]; // 객체 배열의 형태 ( Class 배열변수 = new Class[count] )
		
		for (int i=0; i<p.length; i++) {
			p[i] = new Player();
			System.out.print("참가자의 이름을 입력하세요 >> ");
			p[i].name = input.next();
		}
		run(p, input);
		
		input.close();
	}
}
