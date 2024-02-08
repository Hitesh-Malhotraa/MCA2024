package Recursion;

import java.util.Scanner;

public class keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
//n=23;
		sol(n + "", "");
	}

	public static void sol(String n, String ans) {
		if (n.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = n.charAt(0);
		// ch=2;
		String str = get(ch);
		for (int i = 0; i < str.length(); i++) {
			sol(n.substring(1), ans + str.charAt(i));
		}
	}

	public static String get(char ch) {
		if (ch == '2') {
			return "abc";
		}
		if (ch == '3') {
			return "def";
		}
		if (ch == '4') {
			return "ghi";
		}
		if (ch == '5') {
			return "jkl";
		}
		if (ch == '6') {
			return "mno";
		}

		if (ch == '7') {
			return "pqrs";
		}
		if (ch == '8') {
			return "tuv";
		}
		if (ch == '9') {
			return "wxyz";
		}
		return "";
	}
}
