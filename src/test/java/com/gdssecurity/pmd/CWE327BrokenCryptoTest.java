package com.gdssecurity.pmd;

import org.junit.Assert;
import org.junit.Test;

public class CWE327BrokenCryptoTest {

	@Test
	public void test1() throws Exception {
		Assert.assertEquals(1, PMDRunner.run("src/test/java/resources/cwe327brokencrypto", PMDRunner.RULESET_VULNERABLE));
	}
}
