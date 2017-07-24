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

public class AndroidSpecificTests extends JUnitTests {
	
	@Test(timeout=300000)
	public void runTestApplicationModeling1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"ApplicationModeling1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestDirectLeak1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"DirectLeak1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestInactiveActivity() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"InactiveActivity.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestLibrary2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"Library2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestLogNoLeak() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"LogNoLeak.apk");
		if (res != null)
			Assert.assertEquals(0, res.size());
	}

	@Test(timeout=300000)
	public void runTestObfuscation1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"Obfuscation1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestParcel1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"Parcel1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestPrivateDataLeak1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"PrivateDataLeak1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestPrivateDataLeak2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"PrivateDataLeak2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore		// not supported, would require taint tracking via files
	public void runTestPrivateDataLeak3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"PrivateDataLeak3.apk");
		Assert.assertEquals(2, res.size());
	}
	
	@Test(timeout=300000)
	public void runPublicAPIField1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"PublicAPIField1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runPublicAPIField2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"PublicAPIField2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runView1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("AndroidSpecific"+File.separator+"View1.apk");
		Assert.assertEquals(1, res.size());
	}
	
}
