import java.util.Scanner;
public class CourseAndScore {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int score[] = {95,88,76,62,55};
		String value;
		
		do {
			System.out.print("과목 이름 >> ");
			int findScore = -1; // 점수 초기화
			value = input.next();
			if (value.equals("그만")) {
				break;
			}
			
			for (int i=0; i<course.length; i++) {
				if (course[i].equals(value))
					findScore = score[i];
					break;
			}
			
			if (findScore != -1) {
				System.out.println(value+"의 점수는 "+findScore);
			}
			else {
				System.out.println("없는 과목입니다");
			}
			
		} while (true);
		
		input.close();
	}
}
