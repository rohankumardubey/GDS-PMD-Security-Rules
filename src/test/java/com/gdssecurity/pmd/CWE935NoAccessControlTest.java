package com.gdssecurity.pmd;

import org.junit.Assert;
import org.junit.Test;

public class CWE935NoAccessControlTest {
	@Test
	public void test1() throws Exception {
		Assert.assertEquals(2, PMDRunner.run("src/test/java/resources/cwe935noaccesscontrol/access01", PMDRunner.RULESET_ACCESS));
	}
}