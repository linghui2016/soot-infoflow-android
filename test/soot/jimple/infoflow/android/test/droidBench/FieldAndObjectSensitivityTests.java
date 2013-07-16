package soot.jimple.infoflow.android.test.droidBench;

import java.io.IOException;

import junit.framework.Assert;

import org.junit.Test;

import soot.jimple.infoflow.InfoflowResults;

public class FieldAndObjectSensitivityTests extends JUnitTests {
	
	@Test
	public void runTestFieldSensitivity1() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_FieldSensitivity1.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test
	public void runTestFieldSensitivity2() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_FieldSensitivity2.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test
	public void runTestFieldSensitivity3() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_FieldSensitivity3.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test
	public void runTestFieldSensitivity4() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_FieldSensitivity4.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test
	public void runTestInheritedObjects1() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_InheritedObjects1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test
	public void runTestObjectSensitivity1() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_ObjectSensitivity1.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test
	public void runTestObjectSensitivity2() throws IOException {
		InfoflowResults res = analyzeAPKFile("FieldAndObjectSensitivity_ObjectSensitivity2.apk");
		Assert.assertEquals(0, res.size());
	}

}
