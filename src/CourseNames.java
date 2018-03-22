//Maurice Hanns CSC 242 03/21/2018

import java.util.Scanner;

public class CourseNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String [] sRay = {"Java Programming", "Pre-Calculus I", "Pre-Calculus II",
						  "Java Programming II", "Calculus I", "Calculus II",
						  "Computer Forensic", "Chinese I", "Chinese II", "German"};

				
			for (int i = 0; i < sRay.length; i++){
				
				System.out.println(sRay[i]);

			}
	}

}
