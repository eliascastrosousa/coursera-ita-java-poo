package testes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class AntesDepois {

	@Before
	public static void before() {
		System.out.println("before");
	}
	
	@Test
	void test1() {
		System.out.println("Teste 1");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class teste 2");
	}
	
	@Test
	void test2() {
		System.out.println("Teste 2");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After class teste 2");
	}
	
	@Test
	void test3() {
		System.out.println("Teste 3");
	}
	
	@After
	public static void after() {
		System.out.println("after");
	}
	
	
}
