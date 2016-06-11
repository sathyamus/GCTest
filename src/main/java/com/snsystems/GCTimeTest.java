package com.snsystems;

import java.util.HashMap;
import java.util.Map;

public class GCTimeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		Map<String, String> strings = new HashMap<>();
		
		for (int i=1; i<=1000000; i++) {
			
			String str = new String("Weclome"+i);
			strings.put(String.valueOf(i), str);
			
			Thread.sleep(6000);
		}
		
		Thread.sleep(600000);
		System.out.println(strings.size());
		
	}

}
