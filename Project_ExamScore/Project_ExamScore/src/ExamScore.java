import java.util.Scanner;
import java.util.InputMismatchException;

abstract class StudentCourse {
	protected String dept; // 학과
	protected long number; // 학번
	protected String name; // 이름
	protected int score; // 점수
	
	// 생성자 필요하면 추가
	public StudentCourse() {}
	public StudentCourse(String dept, long number, String name, int score) {
		this.dept = dept;
		this.number = number;
		this.name = name;
		this.score = score;
	}
	
	abstract void InputScore(int i, String dept, long number, String name, int score); // 
	abstract void SetRanking(); //
	abstract void OutputScore(); // 
}

class Score extends StudentCourse {
	private int rank; // 순위
	private boolean retake; // 재수강 여부
	
	// 자신에 대한 객체 배열 선언
	final int Student_MAX = 5; // 상수
	public Score JavaClass[] = new Score[Student_MAX];
	
	// 생성자
	public Score() {}
	public Score(String dept, long number, String name, int score) {
		super(dept, number, name, score);
	}
	
	// 객체 데이터 입력
	public void InputScore(int k, String dept, long number, String name, int score) {
		JavaClass[k] = new Score(dept, number, name, score);
		// 혹은 직접 입력
	}
	
	// 재수강 설정
	public void SetRetake(boolean retake) {
		this.retake = retake;
	}
	// 순위 값 받아오기
	public int GetRank() {
		return  this.rank;
	}
	// 재수강 여부 값 받아오기
	public boolean GetRetake() {
		return this.retake;
	}
	
	public void SetRanking() {
		for (int i=0; i<Student_MAX; i++) {
			int rank = 1; 
			for (int j=0; j<Student_MAX; j++) {
				if (JavaClass[i].score < JavaClass[j].score) {
					// 비교해서 점수가 낮으면
					rank += 1;
				}
			}
			JavaClass[i].rank = rank;
		}
	}
	
	public void OutputScore() {
		for (int i=0; i<Student_MAX; i++) {
			System.out.println("["+(int)(i+1)+"] "+ JavaClass[i].dept +" "
										 +JavaClass[i].number+" "
										 +JavaClass[i].name+" " 
										 +JavaClass[i].score+"("
										 +JavaClass[i].rank+")");
		}
	}
}

class RetakeScore extends Score {
	// 평균값 반환
	public double GetAverage() {
		double sum = 0;
		for (int i=0; i<Student_MAX; i++) {
			sum += JavaClass[i].score;
		}
		return sum/Student_MAX;
	}
	// 재수강 여부 확인 및 재수강 값 변경
	public int SetRetakeInfo() {
		int count = 0;
		boolean retake = false;
		for (int i=0; i<Student_MAX; i++) {
			if (JavaClass[i].score < GetAverage()) {
				JavaClass[i].SetRetake(true);
				count += 1;
			}
		}
		return count;
	}
	@Override
	public void OutputScore() {
		super.OutputScore();
		System.out.println();
		System.out.println("Class Average is "+(double)(GetAverage())+" Number of Retake is "+SetRetakeInfo());
		
		System.out.println();
		System.out.println("[ Retake Student is ... ]");
		for (int i=0; i<Student_MAX; i++) {
			if (JavaClass[i].GetRetake() == true) {
				System.out.println("Dept/No/Name/Score(Rank) : "
									+ JavaClass[i].dept + "/" 
									+ JavaClass[i].number + "/"
									+ JavaClass[i].name + "/" 
									+ JavaClass[i].score +"("
									+ JavaClass[i].GetRank() + ")");
			}
		}
	}
}

public class ExamScore {
	public static void main(String[] args) {
		Score set = new RetakeScore();
		// 입력 기본 세팅 설정
		String dept[] = {"컴퓨터공학과","컴퓨터공학과","기계공학과","일본어과","컴퓨터공학과"};
		long number[] = {20201001, 20192011, 20178001, 20181001, 20201801};
		String name[] = {"김서방","박서방","이서방","최서방","강서방"};
		int score[] = {92,86,47,75,83};
		
		// 객체 값 전달
		for (int i=0; i<set.Student_MAX; i++) {
			set.InputScore(i, dept[i], number[i], name[i], score[i]);
		}
		
		System.out.println("[ MidTerm Exam. Estimation Report ]");
		// 랭킹 설정
		set.SetRanking();
		// Score 클래스 결과 출력
		set.OutputScore();
	}
}
