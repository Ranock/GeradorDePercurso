package br.com.programa;

import java.util.Random;

public class TEste10 {

	public static void main (String args[]) {
		Random rand= new Random();
		
		for(int i= 0; i< 100; i++) {
			System.out.println(rand.nextInt(2));
		}
	}
}
