package chapter12.textInputOutput;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * 08/05/2019 6:05:50 PM
 * 
 * @author Romani Ezzat
 *
 *
 *         Test_01
 *
 */
public class Test_01 {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		PrintWriter output = new PrintWriter("E:\\work\\temp.txt");
		output.printf("amount is %f %e\r\n", 32.32, 32.32);
		output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
		output.printf("%6b\r\n", (1 > 2));
		output.printf("%6s\r\n", "Java");
		output.close();

	}

}
