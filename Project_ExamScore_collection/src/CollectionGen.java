/*********************************************************************************************

*

* 학과, 학번, 이름으로 식별되는 학생 n명(최소 10명 이상)의 자바 평가 점수에 대하여 평점

* 그리고 순위를 구하고, 평균 미만인 학생에 대하여 재수강 여부를 선별하는 프로그램을

* 작성하려 한다. 다음 조건을 만족하도록 프로그래밍 하시오

*

* 가. 학생의 신상 관련 정보를 Sinsang, 자바 점수 관련 정보를 JavaScore 라는 클래스로 정의할 것

* - 학생 신상 관련 정보 : 컴공, 20201007, 방탄소년

* - 자바 점수 관련 정보 : 점수, 평점, 순위, 재수강여부 단, 재수강 여부는 점수가 평균 미만인

* 학생에 대하여 boolean값 true로 처리하며 이를 위한 변수를 private boolean retake로 선언할 것

*

* 나. n명의 신상 및 점수를 관리하기 위해 신상은 Vector를, 점수는 ArrayList를 이용하며

* 이들을 '키'와 '값'으로 관리하기 위해 HashMap를 사용할 것. * 단, 해쉬맵의 매개변수는 Vector와

* ArrayList의 요소로 지정할 것.

*

* 다. 신상정보(학과, 학번, 이름)는 초기화를 통해 Vector를 완성하고, 점수는 키보드 입력할 것.

* 단, 점수 입력 시 InputMismatch 예외를 처리하고 재수강 학생이 존재하도록 적절히 점수를

* 분포하여 입력할 것. 그리고 초기화한 신상정보와 해당 점수를 출력할 것.

*

* 라. 평균을 위한 변수는 static double average으로 선언하고, 메소드 GetAverage에서 평균을

* 구하되 Iterator 인터페이스를 사용할 것

*

* 마. 메소드 SetRanking에서 순위(등수)를 결정하고 순위를 JavaScore에 저장할 것

*

* 바. 메소드 SearchScore에서 '키'로 학생의 이름으로 점수를 검색함 - Sinsang의 학생 이름을,

* '값'으로 JavaScore의 점수를 사용하는 해쉬맵을 이용함. 단, 검색은 1회에 한함.

*

* 사. 상기 해쉬맵을 이용하여 입력한 학생 정보(신상 및 점수관련 정보)를 아래와 같이 출력할 것

* [1] 학과1 학번 이름 점수(순위) 평점 재수강-미대상

* . . .

* [10] 학과5 학번 이름 점수(순위) 평점 재수강-대상

*********************************************************************************************/

 

// < method 구성 예 >

// InputStudData( ); // 학과, 학번, 이름, 성적 입력

// InputReport( ); // 데이터 입력 후 입력된 결과 확인용

// GetAverage( ); // 평균을 구하여 static 변수 average에 저장함

// SetGradeNRetake( ); // 평점(학점) 구하기, 여기서 재수강 여부도 판정함

// SetRanking( ); // 평점을 근거로 순위(rank)를 결정

// SearchScore( ); // 해쉬맵을 이용하여 학생의 이름으로 점수를 검색함

// OutputReport( ); // 해쉬맵을 이용하여 신상 정보와 성적 관련 정보를 모두 출력

// 벡터 컬렉션 클래스
// 배열리스트 컬렉션 클래스
// 해시 맵 컬렉션 클래스
// 키보드 입력
// 입력 예외처리

import java.util.*; // 모든 util 패키지 모두 가져오기

class Sinsang {
	// 학생 신상 정보
	private String dept; // 학과
	private long SID; // 학번
	private String name; // 이름
	
	// 생성자
	public Sinsang() {}
	public Sinsang(String dept, long SID, String name) {
		this.dept = dept;
		this.SID = SID;
		this.name = name;
	}
	// 신상정보 출력
	public void printInfo(int c, Sinsang s) {
		System.out.print(s.dept+" "+s.SID+" "+s.name);
	}
	
	// 신상정보 불러오기
	public String getDept() { return this.dept; }
	public long getSID() { return this.SID; }
	public String getName() { return this.name; }
}

class JavaScore {
	// 점수 관련 정보
	private double score; // 점수
	public static double avg; // 평균
	private String GP; // 평점(Grade Point)
	private int rank; // 순위
	private boolean retake = false; // 재수강 여부
	
	// 생성자
	public JavaScore () {} // 단독 존재인 경우 생략 가능
	
	// 각 객체의 점수 설정
	public void inputStudData(int count, Scanner scan) {
		while (true) {
			int input;
			System.out.print(count+"번째 학생의 점수 입력 >> ");
			try { 
				input = scan.nextInt();
				if (0 > input || input > 100) {
					System.out.println("잘못입력하였습니다. 0~100 사이의 수를 입력하세요");
					scan.next();
					continue;
				}
			}
			catch (InputMismatchException e) {
				System.out.println("잘못입력하였습니다. 0~100 사이의 수를 입력하세요");
				scan.next();
				continue;
			}
			
			this.score = input;
			break;
		}
	}
	
	// 입력 점수 출력
	public void printScore(int c, JavaScore j) {
		System.out.print(j.score);
	}
	// 모든 점수 관련 정보 출력
	public void printInfo(int c, JavaScore j) {
		System.out.print(j.score +"( "+ j.rank + " ) " + j.GP + " 재수강 - ");
		if (j.retake == true) { System.out.print("대상"); }
		else { System.out.print("미대상"); }
	}
	
	// 점수 불러오기
	public double getScore() { return this.score; }
	public int getRank() { return this.rank; }
	public boolean getRetake() { return this.retake; }
	
	// 평균 계산 및 세팅
	public void getAverage(Iterator<JavaScore> it) {
		double sum = 0;
		int count = 0;
		while (it.hasNext()) { // it의 데이터가 없을때까지 반복
			sum += it.next().getScore();
			count += 1;
		}
		avg = (double)(sum/count);
	}
	
	// 랭킹 지정
	public void setRanking(ArrayList<JavaScore> j) {
		for (int a=0; a<j.size(); a++) { // 순위를 매길 학생
			int weight = 1; // 랭킹 가중치
			for (int b=0; b<j.size(); b++) { // 비교 대상
				if ( a == b ) { continue; } // 자기자신과 비교하지않음
				if ( j.get(a).getScore() < j.get(b).getScore()) {
					// 비교해서 값이 적으면 
					weight += 1;
				}
			}
			j.get(a).rank = weight;
		}
	}
	
	// 평점 및 재수강 여부 판별
	public void setGradeNRetake(ArrayList<JavaScore> j) {
		// 100~95 : A+ (4.5)
		// 94~90 : A0
		// 89~85 : B+
		// 84~80 : B0
		// 79~75 : C+
		// 74~70 : C0
		// 69~65 : D+
		// 64~60 : D0
		// under 60 : F and be subject to Retake
		
		for (int i=0; i<j.size(); i++) {
			if (95 <= j.get(i).getScore() && j.get(i).getScore() <= 100) { 
				j.get(i).GP = "A+"; // A+ 
			}
			else if (90 <= j.get(i).getScore() && j.get(i).getScore() <= 94) {
				j.get(i).GP = "A0"; // A0
			}
			else if (85 <= j.get(i).getScore() && j.get(i).getScore() <= 89) {
				j.get(i).GP = "B+"; // B+
			}
			else if (80 <= j.get(i).getScore() && j.get(i).getScore() <= 84) {
				j.get(i).GP = "B0"; // B0
			}
			else if (75 <= j.get(i).getScore() && j.get(i).getScore() <= 79) {
				j.get(i).GP = "C+"; // C+
			}
			else if (70 <= j.get(i).getScore() && j.get(i).getScore() <= 74) {
				j.get(i).GP = "C0"; // C0
			}
			else if (65 <= j.get(i).getScore() && j.get(i).getScore() <= 69) {
				j.get(i).GP = "D+"; // D+
			}
			else if (60 <= j.get(i).getScore() && j.get(i).getScore() <= 64) {
				j.get(i).GP = "D0"; // D0
			}
			else {
				j.get(i).GP = "F"; // F
				j.get(i).retake = true; // 재수강
			}
			
			// 평균 미달 학생도 재수강에 추가
			if (j.get(i).getScore() < avg) {
				j.get(i).retake = true;
			}
		}
	}
}


public class CollectionGen {
	public static void searchScore(Scanner scan, HashMap<Sinsang, JavaScore> hm) {
		// 이름 검색
		System.out.print("점수를 확인할 학생의 이름을 검색하세요 >> ");
		String input = scan.next();
		for (Sinsang n : hm.keySet()) { // 해시맵의 모든 키 객체를 n으로 하나씩 전달
			if (n.getName().equals(input)) { // 객체 n의 이름이 입력값과 일치하면
				System.out.println(input+" 학생의 점수 : "+hm.get(n).getScore()); 
				// 해당 학생의 객체를 키값으로 value 객체를 받아오고 그 객체의 점수를 출력
				return;
			}
		}
		System.out.println("해당 학생이 존재하지않습니다.");
	}
	
	// 입력 값에 대한 신상정보와 점수 출력
	public static void inputReport(Sinsang info, JavaScore obj, 
									Vector<Sinsang> s, ArrayList<JavaScore> j) {
		for (int i=0; i<s.size(); i++) {
			System.out.print("["+(i+1)+"] ");
			info.printInfo(i,s.get(i)); // i번째 학생의 객체정보 전달
			System.out.print(" ");
			obj.printScore(i, j.get(i)); // i번째 학생의 객체정보 전달
			System.out.println();
		}		
	}
	
	// 학생의 신상정보 점수에 관한 최종 정보 출력
	public static void outputReport(HashMap<Sinsang, JavaScore> hm) {
		Set<Sinsang> keys = hm.keySet(); // 해시맵 hm의 모든 키를 Set 컬렉션으로 리턴
		Iterator<Sinsang> it = keys.iterator(); // Set의 각 문자열을 순차 검색하는 Iterator 리턴
		int count = 0;
		while (it.hasNext()) {
			Sinsang key = it.next(); // 벡터 객체의 각 요소를 key로 리턴
			JavaScore value = hm.get(key); // key로부터 얻은 각 점수정보 객체를 value로 리턴
			System.out.print("[ "+(count+1)+" ] ");
			key.printInfo(count, key);
			System.out.print(" ");
			value.printInfo(count, value);
			System.out.println();
			count++;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 벡터 생성 - 신상 정보 객체가 각 벡터 배열에 저장된다
		Vector<Sinsang> s = new Vector<Sinsang>();
		
		// 벡터 신상정보 초기화 
		String dept [] = {"컴퓨터공학과","건축공학과","물리학과","불어불문학과","사회복지학과",
						  "생명공학과","식품영양학과","영어영문학과","전기전자공학과","체육교육과"};
		long SID [] = {20179224, 20183797, 20172829, 20191530, 20191758, 
					   20186539, 20174600, 20189909, 20196326, 20193181};
		String name [] = {"하성현","성준웅","표샘","최우리","백하루","남궁혁","문호","하철","백건","김태현"};
		
		// 객체 삽입
		for (int i=0; i<name.length; i++) { s.add(new Sinsang(dept[i],SID[i],name[i])); }
		
		// 배열 리스트 생성 - 각 학생에 대응하는 점수 관련 정보 객체가 배열 리스트 공간에 저장된다
		ArrayList<JavaScore> j = new ArrayList<JavaScore>();
		
		// 각 객체의 점수 입력
		for (int i=0; i<s.size(); i++) {
			j.add(new JavaScore());
			JavaScore j_tmp = j.get(i); // JavaScore의 객체에 컬렉션 객체를 복사
			j_tmp.inputStudData(i+1, scan); // JavaScore의 객체로서 메소드에 접근
		}
		// 초기화한 신상정보와 해당 점수를 출력
		Sinsang info = new Sinsang(); // Sinsang 클래스에 s를 접근시키기 위해 객체 생성
		JavaScore obj = new JavaScore(); // JavaScore 클래스에 접근하기 위한 객체 생성
		// 신상 정보 및 점수 출력
		System.out.println("[ 기본 학생 정보 출력 ]");
		inputReport(info, obj, s, j);
		
		// 평균점수 계산
		Iterator<JavaScore> it = j.iterator(); // j의 객체 전달
		obj.getAverage(it); // 해당 객체에 매개변수로 ArrayList 전달 가능
		
		// 랭킹 지정
		obj.setRanking(j);
		
		// 각 객체의 점수 대응 평점 및 재수강 여부 판별
		obj.setGradeNRetake(j);
		
		// Vector 요소를 key, ArrayList 요소를 value로 지정한 HashMap 클래스 객체 생성
		HashMap<Sinsang, JavaScore> hm = new HashMap<Sinsang, JavaScore>();
		
		// 각 객체를 HashMap의 key와 value에 대입 
		for (int i=0; i<s.size(); i++) {
			hm.put(s.get(i), j.get(i));
		}
		
		// 해시맵의 키나 값을 검색
		searchScore(scan, hm);
		
		// 해시맵을 이용하여 최종 종합 정보 출력
		System.out.println("[ 학생 정보 최종 출력 | 전체 학생 평균 점수 : " + JavaScore.avg +" ]");
		System.out.println("평균 점수 미달 학생은 재수강 대상입니다.");
		outputReport(hm);
		
		scan.close();
	}
}
