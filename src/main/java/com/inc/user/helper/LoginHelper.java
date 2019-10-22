/**
 * 
 */
package com.inc.user.helper;

/**
 * @author apoongavanam
 *
 */
public class LoginHelper {

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public boolean isGreater(int num1, int num2) {
		testEnvironment(num1, num2);
		// number of lines
		System.out.println(num2);
		System.out.println(num1 + num2);

		System.out.println(num1 + num2);
		return num1 > num2;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	void testEnvironment(int num1, int num2) {
		// TODO Auto-generated method stub
		System.out.println(num2);
		System.out.println(num1 + num2);
		System.out.println(num2);
		System.out.println(num1 + num2);
	}
	

}
