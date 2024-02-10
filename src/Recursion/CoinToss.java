package Recursion;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		sol(n, "");
	}

	public static void sol(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		sol(n - 1, ans + "h");
		sol(n - 1, ans + "t");
	}

}
