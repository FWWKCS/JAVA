import java.util.Random;
public class RandomSquare {
	public static void main(String[] args) {
		int n[][] = new int[4][4];
		
		for (int i=0; i<n.length; i++) {
			for (int j=0; j<n[i].length; j++) {
				int r = (int)(Math.random()*10+1);
				n[i][j] = r;
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
	}
}
