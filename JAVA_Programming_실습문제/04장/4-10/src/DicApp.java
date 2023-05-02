import java.util.Scanner;
class Dictionary {
	private static String kor[] = {"사랑", "아기", "돈", "미래", "희망"};
	private static String eng[] = {"love", "baby", "money", "future", "hope"};
	public static String korToEng(String word) {
		// 검색 코드 작성
		int i = 0;
		for (String w:kor) {
			if (word.equals(w)){
				break;
			}
			i++;
		}
		if (i == kor.length) {
			return word+"는 사전에 없습니다";
		}
		return word+"은(는) "+eng[i];
	}
}
public class DicApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println(" -- 한영 단어 검색 프로그램 -- ");
		while (true) {
			System.out.print("한글 단어 입력 >> ");
			String word = input.next();
			if (word.equals("그만")) break;
			
			System.out.println(Dictionary.korToEng(word));
		}
		
		input.close();
	}
}
