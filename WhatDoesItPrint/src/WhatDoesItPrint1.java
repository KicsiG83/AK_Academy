
public class WhatDoesItPrint1 {

	public static void main(String[] args) {
		int x = -3;
		int y = 10;
		switch (x) {
		case 4:
			y += 7;
		case 2:
			y += 9;
		default:
			y += -2;
		case 0:
			y += 100;
		}
		System.out.println("y = " + y);
	}
}
