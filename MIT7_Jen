import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquares {

	public static boolean testMagic(String pathName) throws IOException {
		boolean isMagic = true;
		int lastSum = -1;

		// Open the file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(pathName));

			// For each line in the file ...
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
				// ... sum each row of numbers

				if (line.equals("")) {
					continue;
				}

				String[] parts = line.split("\t");
				int sum = 0;

				for (String part : parts) {
					sum += Integer.parseInt(part);
					System.out.println(sum);
				}

				if (lastSum == -1) {
					// If this is the first row, remember the sum
					lastSum = sum;

				} else if (lastSum != sum) {
					// if the sums don't match, it isn't magic, so stop reading
					isMagic = false;
					break;
				}
			}

			reader.close();

		} catch (FileNotFoundException fnfe) {
			System.out.println("The file was not found, please contact your administrator.");
			System.exit(1);
		}
		return isMagic;
	}

	public static void main(String[] args) throws IOException {
		String[] fileNames = {
				"Mercury.txt", "Luna.txt", "FailTest.txt" };
		for (String fileName : fileNames) {
			System.out.println(fileName + " is magic? " + testMagic(fileName));
			System.out.println();
		}
	
	}
}
