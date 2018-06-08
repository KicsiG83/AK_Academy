
public class WhatDoesItPrint2 {

	public static void main(String[] args) {
		int i = 250_000_000;
		do {
			System.out.print(i / 1_000_000);
			i *= 2;
		}while(i > 0);
	}
}
