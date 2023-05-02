import java.util.Scanner;
class Phone {
	String name; // 이름
	String tel; // 연락처
	public Phone(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
}
public class PhoneBook {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("인원 수 >> ");
		int count = input.nextInt(); // 인원 수 입력
		
		Phone data[] = new Phone[count];
		
		for (int i=0; i<count; i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸 없이 입력) >> ");
			String name = input.next();
			String tel = input.next();
			data[i] = new Phone(name, tel);
		}
		
		System.out.println("저장되었습니다");
		
		String search;
		while (true) {
			System.out.print("검색할 이름 >> ");
			search = input.next();
			if (search.equals("그만")) break;
			boolean searched = false;
			for (Phone p : data) {
				if (p.name.equals(search)) {
					System.out.println(search+"의 번호는 "+p.tel+" 입니다");
					searched = true;
					break;
				}
			}
			if (searched == false) System.out.println(search+" 이(가) 없습니다");
		}
		input.close();
	}
}
