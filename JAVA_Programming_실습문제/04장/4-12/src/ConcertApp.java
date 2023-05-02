import java.util.Scanner;
class Seat {
	private String name;
	public void set() { // 이름 초기화
			this.name = "---";
	}
	public boolean reservation(Seat x[], int seatNum, String name) {
		// 1. 예약
		if (x[seatNum-1].name.equals("---")) {
			this.name = name;
			return true;
		}
		else {
			System.out.println("이미 예약되어있습니다. 다른 좌석을 선택하세요");
			return false;
		}
	}
	public String view() {
		// 2. 조회
		return name;
	}

	public boolean cancle(Seat x[], String name, int i) {
		// 3. 취소
		// 삭제 및 검증
		if (x[i].name.equals(name)) {
			x[i].name = "---";
			return true;			
		}
		return false;
	}
}
public class ConcertApp {
	public static void R(Seat S[], Seat A[], Seat B[], Scanner input) {
		int selectSeat;
		while (true) {
			System.out.print("좌석 구분 : S(1) | A(2) | B(3)  >> ");
			selectSeat = input.nextInt();
			if (1 > selectSeat || selectSeat > 3) {
				System.out.println("잘못입력하였습니다 다시 입력하세요");
				continue;
			}
			break;
		} // 잘못입력하면 나올 수 없음
		// 선택 좌석 출력
		if (selectSeat == 1) {
			System.out.print("S >> ");
			for (Seat x : S) System.out.print(x.view()+" ");
			System.out.println();
			System.out.print("예약자 이름 >> ");
			String name = input.next();
			while (true) {
				// 범위 외 숫자를 입력하거나 이미 예약되어있는곳을 선택하면 다시시도
				System.out.print("예약 좌석 번호 >> ");
				int seatNum = input.nextInt();
				if (0 > seatNum || seatNum > 10) {
					System.out.println("잘못입력하였습니다 다시 입력하세요");
					continue;
				}
				else if (S[seatNum-1].reservation(S, seatNum, name) == false) { continue; }
				break;
			}
		}
		else if (selectSeat == 2) {
			System.out.print("A >> ");
			for (Seat x : A) System.out.print(x.view()+" ");
			System.out.println();
			System.out.print("예약자 이름 >> ");
			String name = input.next();
			while (true) {
				// 범위 외 숫자를 입력하거나 이미 예약되어있는곳을 선택하면 다시시도
				System.out.print("예약 좌석 번호 >> ");
				int seatNum = input.nextInt();
				if (0 > seatNum || seatNum > 10) {
					System.out.println("잘못입력하였습니다 다시 입력하세요");
					continue;
				}
				else if (A[seatNum-1].reservation(A, seatNum, name) == false) { continue; }
				break;
			}
		}
		else if (selectSeat == 3) {
			System.out.print("B >> ");
			for (Seat x : B) System.out.print(x.view()+" ");
			System.out.println();
			System.out.print("예약자 이름 >> ");
			String name = input.next();
			while (true) {
				// 범위 외 숫자를 입력하거나 이미 예약되어있는곳을 선택하면 다시시도
				System.out.print("예약 좌석 번호 >> ");
				int seatNum = input.nextInt();
				if (0 > seatNum || seatNum > 10) {
					System.out.println("잘못입력하였습니다 다시 입력하세요");
					continue;
				}
				else if (B[seatNum-1].reservation(B, seatNum, name) == false) { continue; }
				break;
			}
		}
	} // R()
	
	public static void V(Seat S[], Seat A[], Seat B[]) {
		System.out.print("S >> ");
		for (Seat x : S) System.out.print(x.view()+" ");
		System.out.println();
		System.out.print("A >> ");
		for (Seat x : A) System.out.print(x.view()+" ");
		System.out.println();
		System.out.print("B >> ");
		for (Seat x : B) System.out.print(x.view()+" ");
		System.out.println();
		System.out.println("<< 조회를 완료하였습니다 >>");
	} // V()
	
	public static void C(Seat S[], Seat A[], Seat B[], Scanner input) {
		int selectSeat;
		while (true) {
			System.out.print("좌석 구분 : S(1) | A(2) | B(3)  >> ");
			selectSeat = input.nextInt();
			if (1 > selectSeat || selectSeat > 3) {
				System.out.println("잘못입력하였습니다 다시 입력하세요");
				continue;
			}
			break;
		} // 잘못입력하면 나올 수 없음
		// 선택 좌석 출력
		if (selectSeat == 1) {
			System.out.print("S >> ");
			for (Seat x : S) System.out.print(x.view()+" ");
			System.out.println();
			while (true) {
			// 없는 이름을 입력하면 다시시도
				System.out.print("예약 취소자 이름 >> ");
				String name = input.next();
				boolean cancled = false;
				int i = 0;
				for (Seat x : S) {
					if (cancled == true) {
						x.cancle(S, name, i);
						i++;
					}
					else {
						cancled = x.cancle(S, name, i);
						i++;						
					}
				}
				if (cancled == false) {
					System.out.println(name+"은(는) 선택한 좌석에 예약하지 않았습니다.");
					break;					
				}
				break;
			}
		}
		else if (selectSeat == 2) {
			System.out.print("A >> ");
			for (Seat x : A) System.out.print(x.view()+" ");
			System.out.println();
			while (true) {
				// 없는 이름을 입력하면 다시시도
					System.out.print("예약 취소자 이름 >> ");
					String name = input.next();
					boolean cancled = false;
					int i = 0;
					for (Seat x : S) {
						if (cancled == true) {
							x.cancle(S, name, i);
							i++;
						}
						else {
							cancled = x.cancle(S, name, i);
							i++;						
						}
					}
					if (cancled == false) {
						System.out.println(name+"은(는) 선택한 좌석에 예약하지 않았습니다.");
						break;						
					}
					break;
				}
		}
		else if (selectSeat == 3) {
			System.out.print("B >> ");
			for (Seat x : B) System.out.print(x.view()+" ");
			System.out.println();
			while (true) {
			// 없는 이름을 입력하면 다시시도
				System.out.print("예약 취소자 이름 >> ");
				String name = input.next();
				boolean cancled = false;
				int i = 0;
				for (Seat x : S) {
					if (cancled == true) {
						x.cancle(S, name, i);
						i++;
					}
					else {
						cancled = x.cancle(S, name, i);
						i++;						
					}
				}
				if (cancled == false) {
					System.out.println(name+"은(는) 선택한 좌석에 예약하지 않았습니다.");
					break;					
				}
				break;
			}
		}	
	} // C()
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		// 3개의 객체 배열 S, A, B
		Seat S[] = new Seat[10];
		Seat A[] = new Seat[10];
		Seat B[] = new Seat[10];
		
		for (int i=0; i<10; i++) {
			S[i] = new Seat();
			S[i].set();
			A[i] = new Seat();
			A[i].set();
			B[i] = new Seat();
			B[i].set();
		}
		int select = -1;
		while (true) {
			System.out.print("예약:1 | 조회:2 | 취소:3 | 종료:4  >> ");
			select = input.nextInt();
			if (select == 4) break;
			switch (select) {
			case 1: R(S,A,B,input); break;
			case 2: V(S,A,B); break;
			case 3: C(S,A,B,input); break;
			default: 
				System.out.println("잘못입력하였습니다");
			}
		}
		
		input.close();
	}
}
