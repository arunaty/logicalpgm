package Test;

import org.testng.annotations.Test;

public class rightangletraingle {

	// *
	// * *
	// * * *
	// * * * *
	// * * * * *

	@Test
	public void main() {
		int star = 1;

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= star; j++) {

				System.out.print("* ");

			}
			System.out.println();
			star++;

		}

	}

}
