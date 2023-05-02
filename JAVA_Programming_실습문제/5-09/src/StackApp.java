import java.util.Scanner;

interface Stack {
	int length(); // 현재 스택에 저장된 개수 리턴
	int capacity(); // 스택의 전체 저장 가능한 개수 리턴
	String pop(); // 스택의 top의 실수 저장
	boolean push(String val); // 스택의 top에 저장된 실수 리턴
}

class StringStack implements Stack {
	private String stack[];
	private int index = -1;
	private String pop;
	public StringStack(int size) {
		stack = new String[size];
	}
	public int length() {
		return stack.length;
	}
	public int capacity() { // 스택의 전체 저장 가능한 개수 리턴
		return stack.length-this.index-1;
	}
	public String pop() {
		// 마지막 인덱스부터 하나씩 출력
		String data = ""+stack[this.index]; // 정수 -> 문자열 형변환
		this.index -= 1;
		return data;
	}
	public boolean push(String val) {
		if (capacity() == 0) {
			return false;
		}
		this.index += 1;
		stack[this.index] = val;
		return true;
	}
}

public class StackApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = input.nextInt();
		StringStack s = new StringStack(size);
		while (true) {
			System.out.print("문자열 입력 >> ");
			String text = input.next();
			if (text.equals("그만")) break;
			
			boolean pushed = s.push(text);
			if (pushed == false) System.out.println("스택이 꽉 차서 푸시 불가!"); continue;
		}
		
		System.out.print("스택에 저장된 모든 문자열 팝 : ");
		for (int i=0; i<size; i++) {
			System.out.print(s.pop()+" ");
		}
		input.close();
	}
}




