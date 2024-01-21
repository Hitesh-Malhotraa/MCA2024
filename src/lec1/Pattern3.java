package lec1;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//			System.out.println(n);
		int nsp = n - 1;
		int nst = 1;
		for (int row = 0; row < n; row++) {
for(int csp=0;csp<nsp;csp++)
{
	System.out.print(" ");
}
for(int cst=0;cst<nst;cst++)
{
	System.out.print("*");
}
nsp--;
nst++;
System.out.println();
		}
	}

}
