/**
 * 
 */
package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author yotti
 *
 */
public class AppTest {
	App a = new App();
	// Presserei1Data pr = new Presserei1Data();
	// String username = Double.toString(pr.getArbeitSplanNr());
	// Presserei1 p1 = new Presserei1();

	String t = a.Sample();

	@Test
	public void test() {
		//double p=testPresserei();
		assertEquals(t, "Sample");
		//assertEquals(p, "Sample");

	}

//	public double testPresserei() {
//		Presserei p = null;
//		try {
//
//			p = new Presserei(pr, username);
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//		return p.gettextFied_ArbeitsplanNr();
//	}

}
