package Lec2;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 0;
		int nsp = n - 2;
		while (row < n) {
			if (row == 0 || row == n - 1) {
				for (int cst = 0; cst < n; cst++) {
					System.out.print("* ");
				}
				row++;
				System.out.println();
				continue;
			}
			System.out.print("* ");
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			row++;
			System.out.println();
		}

	}

}
