package Lec2;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 0;
		int nst = n;
		int nsp = 0;
		while (row < n) {
			// space;
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print("  ");
			}
			// stars
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("* ");
			}
			row++;
			System.out.println();
			nst--;
			nsp += 2;

		}
	}

}
