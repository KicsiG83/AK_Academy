
public class WhatDoesItPrint6 {

	public static void main(String[] args) {
		int x = 12;
		int y = 4;
		int z = 1;
		z = x + y;

		if (z > y && z > x) {
			y = 7;
			z = y;
		}
		while (z > 10) {
			z--;
			x++;
		}
		if ((x * x) % 5 == 0) {
			x /= 5;
		}
		do {
			if (z + 1 > 107) {
				z -= 1;
			} else if (z + 2 > 108) {
				z -= 2;
			} else {

			}
		} while (z > y + x);
		int emit = 3, rouy = -2;
		int gintsaw = Integer.MAX_VALUE, pots = Integer.MIN_VALUE;
		if (emit + rouy + gintsaw + pots > 0) {
			emit = pots + x + y + z;
		}
	}
}
