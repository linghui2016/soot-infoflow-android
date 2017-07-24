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

public class LifecycleTests extends JUnitTests {
	
	@Test(timeout=300000)
	public void runTestActivityEventSequence1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityEventSequence1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore // Test case broken?
	public void runTestActivityEventSequence2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityEventSequence2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestActivityEventSequence3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityEventSequence3.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestActivityLifecycle1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityLifecycle1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestActivityLifecycle2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityLifecycle2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestActivityLifecycle3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityLifecycle3.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestActivityLifecycle4() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivityLifecycle4.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestActivitySavedState1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ActivitySavedState1.apk");
		Assert.assertEquals(2, res.size());		// We consider the saved state plus the actual leak as sinks
	}
	
	@Test(timeout=300000)
	public void runTestApplicationLifecycle1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"/ApplicationLifecycle1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestApplicationLifecycle2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ApplicationLifecycle2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestApplicationLifecycle3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ApplicationLifecycle3.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestAsynchronousEventOrdering1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"AsynchronousEventOrdering1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestBroadcastReceiverLifecycle1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"BroadcastReceiverLifecycle1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Ignore
	@Test(timeout=300000)
	public void runTestBroadcastReceiverLifecycle2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"BroadcastReceiverLifecycle2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestBroadcastReceiverLifecycle3() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"BroadcastReceiverLifecycle3.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestEventOrdering1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"EventOrdering1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore		// not supported yet
	public void runTestFragmentLifecycle1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"FragmentLifecycle1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore		// not supported yet
	public void runTestFragmentLifecycle2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"FragmentLifecycle2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	@Ignore
	public void runTestServiceEventSequence1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ServiceEventSequence1.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	@Ignore
	public void runTestServiceEventSequence2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ServiceEventSequence2.apk");
		Assert.assertEquals(1, res.size());
	}

	@Test(timeout=300000)
	public void runTestServiceLifecycle1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ServiceLifecycle1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestServiceLifecycle2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"ServiceLifecycle2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestSharedPreferenceChanged1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("Lifecycle"+File.separator+"SharedPreferenceChanged1.apk");
		Assert.assertEquals(2, res.size());		// write to shared preference + leak from there as individual leaks
	}

}
