/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package soot.jimple.infoflow.android.test.droidBench;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.xmlpull.v1.XmlPullParserException;

import soot.jimple.infoflow.results.InfoflowResults;

public class GeneralJavaTests extends JUnitTests {
		
	@Test(timeout=300000)
	public void runTestClone1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Clone1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestLoop1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Loop1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore // requires StubDroid
	public void runTestSerialization1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Serialization1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestLoop2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Loop2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore("overwrites inside a buffer")		// not supported yet in FlowDroid
	public void runTestObfuscation1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Obfuscation1.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestExceptions1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestExceptions2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore		// not supported yet, would require condition evaluation
	public void runTestExceptions3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions3.apk");
		Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestExceptions4() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions4.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestExceptions5() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions5.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestExceptions6() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions6.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestExceptions7() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"Exceptions7.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestFactoryMethods1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"FactoryMethods1.apk");
		Assert.assertNotNull(res);
		Assert.assertEquals(2, res.size());
	}

	@Test(timeout=300000)
	public void runTestSourceCodeSpecific1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"SourceCodeSpecific1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestStartProcessWithSecret1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StartProcessWithSecret1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore		// not supported yet in FlowDroid
	public void runTestStaticInitialization1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StaticInitialization1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestStaticInitialization2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StaticInitialization2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore		// not supported yet in FlowDroid
	public void runTestStaticInitialization3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StaticInitialization3.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore		// needs complex library summaries
	public void runTestStringFormatter1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StringFormatter1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestStringPatternMatching1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StringPatternMatching1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestStringToCharArray1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StringToCharArray1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestStringToOutputStream1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"StringToOutputStream1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestUnreachableCode() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"UnreachableCode.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore		// TODO: produces false positives, need to check
	public void runTestVirtualDispatch1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"VirtualDispatch1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestVirtualDispatch2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"VirtualDispatch2.apk");
		Assert.assertEquals(2, res.size());  // normally 1, +1 for context-insensitive CFG
	}
	
	@Test(timeout=300000)
	@Ignore		// TODO: SPARK issue, maybe context-insensitive CFG
	public void runTestVirtualDispatch3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"VirtualDispatch3.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestVirtualDispatch4() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("GeneralJava"+File.separator+"VirtualDispatch4.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}

}
