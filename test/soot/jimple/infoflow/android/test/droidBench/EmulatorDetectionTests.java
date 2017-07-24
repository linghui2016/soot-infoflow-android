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
import org.junit.Test;
import org.xmlpull.v1.XmlPullParserException;

import soot.jimple.infoflow.results.InfoflowResults;

public class EmulatorDetectionTests extends JUnitTests {
	
	@Test(timeout=300000)
	public void runTestBattery1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"Battery1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestBluetooth1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"Bluetooth1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestBuild1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"Build1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestContacts1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"Contacts1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestContentProvider1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"ContentProvider1.apk");
		Assert.assertEquals(2, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestDeviceId1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"DeviceId1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestFile1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"File1.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestIMEI1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"IMEI1.apk", true);
		Assert.assertEquals(2, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestIP1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"IP1.apk", true);
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestPI1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"PI1.apk", true);
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestPlayStore1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"PlayStore1.apk");
		Assert.assertEquals(2, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestPlayStore2() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"PlayStore2.apk");
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestSensors1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"Sensors1.apk", true);
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestSubscriberId1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"SubscriberId1.apk", true);
		Assert.assertEquals(1, res.size());
	}
	
	@Test(timeout=300000)
	public void runTestVoiceMail1() throws IOException, XmlPullParserException {
		InfoflowResults res = analyzeAPKFile("EmulatorDetection"+File.separator+"VoiceMail1.apk", true);
		Assert.assertEquals(1, res.size());
	}
	
}
