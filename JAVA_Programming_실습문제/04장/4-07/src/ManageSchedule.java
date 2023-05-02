import java.util.Scanner;
class Day {
	private String work;
	public void set (String work) { this.work = work; }
	public String get() { return work; }
	public void show() {
		if (work == null) { System.out.println("없습니다"); }
		else System.out.println(work+"입니다");
	}
}
class MonthSchedule {
	private int totalDay; // 월 객체
	private int day;
	private String Todo;
	
	Day dailyWork[]; // 객체 배열 선언

	public MonthSchedule(int totalDay) { 
		this.totalDay = totalDay;
		dailyWork = new Day[this.totalDay]; // 배열 크기 선언
		// 필드에 선언을 하고, 생성자 안에서 크기를 지정함으로서 OutofIndex 오류가 일어나지 않음
		for (int i=0; i<this.totalDay; i++) {
			dailyWork[i] = new Day();
		}
	}
	
	public void run(Scanner input) {
		// 반복문과 Day 객체 배열 생성
		int s = -1;
		while (s != 3) {
			System.out.print("할 일(입력 : 1, 보기 : 2, 끝내기 : 3) >> ");
			s = input.nextInt(); // 번호 입력
			switch (s) {
			case 1: { // input() 
				System.out.print("날짜 입력(1~"+this.totalDay+") >> ");
				this.day = input.nextInt();
				if (1 <= this.day && this.day <= totalDay) {}
				else {
					System.out.println("잘못 입력하였습니다.");
					continue;
				}
				System.out.print("할 일(빈칸없이 입력) >> ");
				this.Todo = input.next();
				input.nextLine();
				dailyWork[this.day-1].set(this.Todo);
				
				System.out.println();
				break;
			}
			case 2: { // view()
				System.out.print("날짜 입력(1~"+this.totalDay+") >> ");
				int selectDay = input.nextInt();
				if (1 <= this.day && this.day <= totalDay) {}
				else {
					System.out.println("잘못 입력하였습니다.");
					continue;
				}
				input.nextLine();
				System.out.print(this.day+"일의 할 일은 ");
				dailyWork[selectDay-1].show();
				System.out.println();
				break;
			}
			case 3: // finish()
				System.out.println("프로그램을 종료합니다");
				input.nextLine();
				break;
			default : System.out.println("잘못 입력했습니다"); 
			}
		}
	}
	
}
public class ManageSchedule {
	public static void main(String[] args) {
		System.out.println("이번 달 스케줄 관리 프로그램");
		Scanner input = new Scanner(System.in);
		MonthSchedule May = new MonthSchedule(31);
		May.run(input);
	}
}
