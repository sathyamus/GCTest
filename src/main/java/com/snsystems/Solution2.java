package com.snsystems;

import java.util.*;
import java.io.*;

class Solution2 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int n = in.nextInt();
			
			double result = 0;
			int count = 0;
			while (count < n) {
				double innerResult = 0;
				for (int j = 0; j <= count; j++) {
					innerResult += Math.pow(2, j) * b;
				}
				count++;
				result = (a + innerResult);
				System.out.print((int)result + " ");
			}
			System.out.println("");
		}
		in.close();
	}
}