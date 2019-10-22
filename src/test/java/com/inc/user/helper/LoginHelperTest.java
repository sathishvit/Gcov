/**
 * 
 */
package com.inc.user.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.inc.user.utility.Testing;

/**
 * @author apoongavanam
 *
 */
public class LoginHelperTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}

	@Before
	public void before() {
		System.out.println("Before Test Case");
	}

	@Test
	public void isGreaterTest() {
		System.out.println("Test");
		LoginHelper loginHelper = new LoginHelper();
		assertTrue("Num 1 is greater than Num 2", loginHelper.isGreater(4, 3));
	}

	@After
	public void after() {
		System.out.println("After Test Case");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}

	@Test
	public void isTesting() {
		Testing test = new Testing();
		System.out.println("Test");
		assertTrue("Ananthan", test.methodData());
	}
	

	 @Rule
	    public ExpectedException thrown = ExpectedException.none();

	    @Test
	    public void testReadFile3() throws IOException {
	                
	        thrown.expect(IOException.class);
	        FileReader reader = new FileReader("test.txt");
	        reader.read();
	        reader.close();
	    }

}
