package Fenyuk;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Application_1 {

	public static void main(String[] args) {
		
		Integer Integer [] = new Integer[10];
		Random r = new Random();
		int Rmd;
		
		for(int i = 0; i < 10; i++) {
			Rmd = r.nextInt(100);
			Integer[i] = Rmd;
		}
       //System.out.println(Integer[i] + " ");
		System.out.println(Arrays.toString(Integer));
		
		System.out.println("After sorting asc");
		Arrays.sort(Integer);
		System.out.println(Arrays.toString(Integer));
		
		System.out.println("After sorting desc");
		Arrays.sort(Integer, Collections.reverseOrder());
		System.out.println(Arrays.toString(Integer));
		
	}

	
}
