//Maurice Hanns CSC 242 03/22/2018

import java.util.Random;
import java.util.Scanner;

public class LastOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random rand1 = new Random();
		
		int [] lRay = new int[5];
				
			for (int i = 0; i < lRay.length; i++){
				
				lRay[i] = rand1.nextInt(75);
				//System.out.println(lRay[i]);
			}
			
			System.out.println(lRay[lRay.length-1]);
	}

}