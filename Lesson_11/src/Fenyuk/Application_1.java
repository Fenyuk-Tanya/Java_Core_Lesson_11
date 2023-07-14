package Fenyuk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application_1 {

	public static void main(String[] args) {
		
		Integer integer [] = new Integer[10];
		Random r = new Random();
		int rmd;
		
		for(int i = 0; i < 10; i++) {
			rmd = r.nextInt(100);
			integer[i] = rmd;
		}
       //System.out.println(Integer[i] + " ");
		System.out.println(Arrays.toString(integer));
		
		System.out.println("After sorting asc");
		Arrays.sort(integer);
		System.out.println(Arrays.toString(integer));
		
		System.out.println("After sorting desc");
		Arrays.sort(integer, Collections.reverseOrder());
		System.out.println(Arrays.toString(integer));
		
	}

	
}
