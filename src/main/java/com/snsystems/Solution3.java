package com.snsystems;

import java.util.*;
import java.io.*;

class Solution3 {
	public static void main(String[] argh) {
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length() + B.length());
//        if (A.compareTo(B) > 0) {
//        	System.out.println("No");
//        } else {
//        	System.out.println("Yes");
//        }
        
        System.out.println(A.compareTo(B) > B.compareTo(A) ? "Yes" : "No");
        String A_updated = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        String B_updated = Character.toUpperCase(B.charAt(0)) + B.substring(1);
        
        System.out.println(A_updated + " " + B_updated);
        
	}
}