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

public class InterComponentCommunicationTests extends JUnitTests {
	
	@Test(timeout=300000)
	public void runTestActivityCommunication1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication3.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication4() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication4.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication5() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication5.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication6() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication6.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication7() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication7.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityCommunication8() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ActivityCommunication8.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestBroadcastTaintAndLeak1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"BroadcastTaintAndLeak1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestComponentNotInManifest1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ComponentNotInManifest1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestEventOrdering1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"EventOrdering1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestIntentSink1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"IntentSink1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestIntentSink2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"IntentSink2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore
	public void runTestIntentSource1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"IntentSource1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestServiceCommunication1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"ServiceCommunication1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestSharedPreferences1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"SharedPreferences1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore		// we do not support interleaved component executions yet
	public void runTestSingletons1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"Singletons1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestUnresolvableIntent1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("InterComponentCommunication"+File.separator+"UnresolvableIntent1.apk");
		Assert.assertEquals(1, res.size());
	}

}
