import java.util.Scanner;
public class CheckMoney {
	public static void main(String[] args) {
		Scanner value = new Scanner(System.in);
		
		System.out.print("금액을 입력하시오 >> ");
		int money = value.nextInt();
		
		int fiftyK = money / 50000;
		money -= fiftyK * 50000;
		int tenK = money / 10000;
		money -= tenK * 10000;
		int oneK = money / 1000;
		money -= oneK * 1000;
		int oneH = money / 100;
		money -= oneH * 100;
		int fifty = money / 50;
		money -= fifty * 50;
		int ten = money / 10;
		money -= ten*10;
		
		System.out.println("오만원권 : "+fiftyK+"매");
		System.out.println("만원권 : "+tenK+"매");
		System.out.println("천원권 : "+oneK+"매");
		System.out.println("백원 : "+oneH+"개");
		System.out.println("오십원 : "+fifty+"개");
		System.out.println("십원 : "+ten+"개");
		System.out.println("일원 : "+money+"개");
		
		value.close();
	}
}
