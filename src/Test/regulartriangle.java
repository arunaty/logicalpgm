package Test;

import org.testng.annotations.Test;

public class regulartriangle {

	@Test
	public void main() {

		//    *
		//   ***
		//  *****
		// *******

		int space = 3;
		int star = 1;

		for (int i = 1; i <= 4; i++) // loop for row only
		{

			for (int j = 1; j <= space; j++)// loop for the space only
			{
				System.out.print(" ");

			}
			for (int k = 1; k <= star; k++)// to print star
			{

				System.out.print("*");
			}
			System.out.println();
			space--;
			star += 2;
		}

	}

}
