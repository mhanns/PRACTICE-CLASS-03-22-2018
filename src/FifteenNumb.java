//Maurice Hanns CSC 242 03/21/2018

import java.util.Scanner;
import java.util.Random;

public class FifteenNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		Random rand1 = new Random();
		
		int [] rRay = new int[15];
				
			for (int i = 0; i < rRay.length; i++){
				
				rRay[i] = rand1.nextInt(100);

			}
			System.out.println(rRay[2] + " " + rRay[4] + " " + rRay[8] + " " + rRay[11]  + " " + rRay[19]);
	}

}
