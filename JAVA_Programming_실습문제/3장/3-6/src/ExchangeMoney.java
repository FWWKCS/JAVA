import java.util.Scanner;
public class ExchangeMoney {
	public static void main(String[] args) {
		int [] unit = {50000,10000,1000,500,100,50,10,1};
		
		Scanner input = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = input.nextInt();
		
		for (int i=0; i<unit.length; i++) {
			int count = money / unit[i];
			if (count > 0)
				System.out.println(unit[i]+"원 짜리 : "+count+"개");
			money -= unit[i] * count;
		}
		
		input.close();
	}
}
