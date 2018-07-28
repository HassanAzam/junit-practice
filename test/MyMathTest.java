import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class MyMathTest {
	MyMath myMath = new MyMath();
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Beforeclass");
	}
	
	@AfterAll
	public static void afterclass() {
		System.out.println("afterclass");
	}
	
	@After
	public void after() {
		System.out.println("After");
	}
	
	//MyMath.sum()
	// 1,2,3 => 6
	
	
	@Test
	void sumwith3numbers() {
		System.out.println("Test1");
		//check that result is 6
		assertEquals(6, myMath.sum(new int[]{1,2,3}));
	}
	
	@Test
	void sumwith1numbers() {	
		System.out.println("Test2");
		//check that result is 6
		assertEquals(3, myMath.sum(new int[]{3}));
	}

}
