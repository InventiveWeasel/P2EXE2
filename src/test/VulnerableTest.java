package test;

import static org.junit.Assert.*;

import org.junit.Test;

import exe2.VulnerableClass;

public class VulnerableTest {

	@Test
	public void test() {
		VulnerableClass vul = new VulnerableClass();
		vul.vulnerableMethod("teste.txt");
		fail("Not yet implemented");
	}

}
