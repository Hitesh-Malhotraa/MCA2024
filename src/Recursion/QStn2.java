package Recursion;

public class QStn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fun(6);
	}

	public static int fun(int n) {
		if (n == 1)
			return 1;
		int res = fun(n - 1) * n;
		return res;
	}

}
